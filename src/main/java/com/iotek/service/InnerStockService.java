package com.iotek.service;

import com.iotek.po.InnerStock;

import java.util.List;

/**
 * Created by dell on 2017/12/25.
 */
public interface InnerStockService {
    /**
     * ��������Ϣ
     * @param innerStock
     * @return
     */
    boolean addInnerStock(InnerStock innerStock);

    /**
     * ����һ������ѯ�����Ϣ
     * @param innerStock
     * @return
     */
    List<InnerStock> searchInnerStock(InnerStock innerStock);
}
