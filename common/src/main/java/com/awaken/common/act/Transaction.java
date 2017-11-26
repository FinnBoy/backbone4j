package com.awaken.common.act;

import com.awaken.common.state.Demand;
import com.awaken.common.state.Info;

/**
 * 一次事务的执行，要么全部执行成功，否则全部回滚
 */
public interface Transaction {
    Info perform(Demand demand);
}
