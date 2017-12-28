package com.iotek.service;

import com.iotek.po.OuterStock;

import java.util.List;

/**
 * Created by dell on 2017/12/25.
 */
public interface OuterStockService {
    /**
     * 添加出库信息
     * @param outerStock
     * @return
     */
    boolean addOuterStock(OuterStock outerStock);

    /**
     * 按单一条件查询出库信息
     * @param outerStock
     * @return
     */
    List<OuterStock> searchOuterStock(OuterStock outerStock);
}
