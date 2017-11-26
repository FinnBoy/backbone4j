package com.awaken.common.act;

import com.awaken.common.state.Demand;
import com.awaken.common.state.Info;

/**
 * 普通的执行操作
 */
public interface Operation {
    Info execute(Demand demand);
}
