package com.awaken.common.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class IdEntity implements IEntity {

    /**
     * 从数据库当前值 + 1，再插入数据库：在高并发下，会发生同一时间获取到相同值，递增后造成主键重复。
     * <p>
     * 解决方法：<br/>
     * 1、synchronized，线程阻塞，app与DB的IO交互，性能下降<br/>
     * 2、Redis缓存自增<br/>
     * 3、乐观锁，app与DB的IO交互，性能下降<br/>
     * 4、悲观锁（数据库行锁），排他锁阻塞，app与DB的IO交互，性能下降<br/>
     * 5、数据库唯一性约束，报错用户体验差，app与DB的IO交互，性能下降<br/>
     * 6、Java AtomicInteger自增，集群部署跨应用时会遇到问题<br/>
     * 7、一次从id持久化表中取1000个序列号：从持久化表内取id当前值，并更新id + 1000；应用内缓存取得的id当前值和1000的自增额度，
     * 1000额度用完后再去查询DB取值。
     * </p>
     * <p>
     * 1和6的缓存自增，并定时持久化当前值到数据库。<br/>
     * 系统正常停止维护时，在停止之前中止id自增持久化数据到DB的处理，并将当前值持久化到DB，然后关闭。<br/>
     * 系统非正常停止或正常停止，在重新启动后，取业务表主键当前最大值和id持久化表当前值比较，选择较大值重新持久化维护到DB，
     * 并缓存用于正常业务自增。
     * </p>
     * <p>
     * db／redis自增均可考虑跳步&缓存来降低压力（每次自增10/50/100回来后缓存在本地，本地的用完再去拿）
     * </p>
     */
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "id_generator")
    private Long id;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IdEntity)) return false;

        IdEntity idEntity = (IdEntity) o;

        return id.equals(idEntity.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
