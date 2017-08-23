
---
`@ManyToMany` `@ManyToOne` `@OneToMany` `@OneToOne`

- cascade
  
  - `CascadeType.PERSIST`
  - `CascadeType.MERGE`
  - `CascadeType.REMOVE`
  - `CascadeType.REFRESH` 级联刷新操作（只会查询获取操作）
    
     session.refresh 操作会对级联对象一起refresh（从DB中获取最新数据）
    
  - `CascadeType.ALL`
  
  用于声明以上哪些级联操作有效。
  
- fetch
  
  - `LAZY` 从DB获取对象时，级联对象采用懒加载
  - `EAGER` 从DB获取对象时，直接一起取出级联对象

---
`@ManyToMany` `@OneToMany` `@OneToOne`

- mappedBy
  
  > 在四种关联关系OneToOne，OneToMany，ManyToOne和ManyToMany中，只有OneToOne、OneToMany和ManyToMany这三中关联关系有mappedBy属性。 
  
  > 下面是mappedBy属性在java doc里边的解释： 
  
  > the field that owns the relationship. Required unless the relationship is unidirectional. 
  
  > 翻译成中文是：
   
  > 拥有关联关系的域，如果关系是单向的就不需要。 

  > 那么什么叫拥有关联关系呢，可以这么认为，假设是双向一对一的话，那么拥有关系的这一方有建立、解除和更新与另一方关系的能力，而另一方没有，只能被动管理；在双向一对多和双向多对多中是一个意思。 
  
  > 由于JoinTable和JoinColumn一般定义在拥有关系的这一端，而Hibernate又不让mappedBy跟JoinTable和JoinColumn定义在一起，所以mappedBy一定是定义在关系的被拥有方，the owned side，也就是跟定义JoinTable和JoinColumn互斥的一方，它的值指向拥有方中关于被拥有方的字段，可能是一个对象（OneToMany），也可能是一个对象集合（ManyToMany）。 

  > 关系的拥有方负责关系的维护，在关系拥有方建立外键，所以JoinTable和JoinColumn都是定义在关系拥有方。 

  > 另外mappedBy有一个功能就是，加入这个属性之后，可以避免自动生成中间表。 

  > 最后，mappedBy=“xxx”，可以这么理解，mappedBy定义在关系的被拥有方，mappedBy定义所在的类（不管是单个还是集合的形式）在关系拥有者那一方的名称是“xxx”。


---



FrontEnd的一个Button、或Link，
只要对应到BackEnd的Service，就应该以Service为主，以Component为辅。

Service也是Resource，调用后台的Service实际就是获取后台的Resource。
（Restful的理念）

Link对应到的静态资源呢？