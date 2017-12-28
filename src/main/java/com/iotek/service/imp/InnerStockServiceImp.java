/**
 * Copyright (C), 2015-2017
 * FileName: InnerStockServiceImp
 * Author:   dell
 * Date:     2017/12/25 9:12
 * Description:
 */
package com.iotek.service.imp;

import com.iotek.dao.InnerStockDao;
import com.iotek.po.InnerStock;
import com.iotek.service.InnerStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dell on 2017/12/25.
 */
@Service(value = "innerStockService")
public class InnerStockServiceImp implements InnerStockService {
    @Autowired
    private InnerStockDao innerStockDao;
    /**
     * 添加入库信息
     *
     * @param innerStock
     * @return
     */
    @Override
    public boolean addInnerStock(InnerStock innerStock) {
        checkInnerStock(innerStock);
        return innerStockDao.add(innerStock);
    }

    /**
     * 按单一条件查询入库信息
     *
     * @param innerStock
     * @return
     */
    @Override
    public List<InnerStock> searchInnerStock(InnerStock innerStock) {
        checkInnerStock(innerStock);
        return innerStockDao.query(innerStock);
    }
    private void checkInnerStock(InnerStock innerStock){
        if (innerStock == null) {
            throw new NullPointerException("入库信息不能为空");
        }
    }
}
