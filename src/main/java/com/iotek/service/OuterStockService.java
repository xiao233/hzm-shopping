package com.iotek.service;

import com.iotek.po.OuterStock;

import java.util.List;

/**
 * Created by dell on 2017/12/25.
 */
public interface OuterStockService {
    /**
     * ��ӳ�����Ϣ
     * @param outerStock
     * @return
     */
    boolean addOuterStock(OuterStock outerStock);

    /**
     * ����һ������ѯ������Ϣ
     * @param outerStock
     * @return
     */
    List<OuterStock> searchOuterStock(OuterStock outerStock);
}
