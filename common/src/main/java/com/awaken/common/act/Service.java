package com.awaken.common.act;

import com.awaken.common.state.Demand;
import com.awaken.common.state.Info;

/**
 * 服务
 */
public interface Service {
    Info execute(Demand demand);
}
