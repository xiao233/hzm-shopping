package com.iotek.service;

import com.iotek.po.InnerStock;

import java.util.List;

/**
 * Created by dell on 2017/12/25.
 */
public interface InnerStockService {
    /**
     * 添加入库信息
     * @param innerStock
     * @return
     */
    boolean addInnerStock(InnerStock innerStock);

    /**
     * 按单一条件查询入库信息
     * @param innerStock
     * @return
     */
    List<InnerStock> searchInnerStock(InnerStock innerStock);
}
