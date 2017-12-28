/**
 * Copyright (C), 2015-2017
 * FileName: OuterStockServiceImp
 * Author:   dell
 * Date:     2017/12/25 17:12
 * Description:
 */
package com.iotek.service.imp;

import com.iotek.dao.OuterStockDao;
import com.iotek.po.OuterStock;
import com.iotek.service.OuterStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dell on 2017/12/25.
 */
@Service(value = "outerStockService")
public class OuterStockServiceImp implements OuterStockService {
    @Autowired
    private OuterStockDao outerStockDao;
    /**
     * 添加出库信息
     *
     * @param outerStock
     * @return
     */
    @Override
    public boolean addOuterStock(OuterStock outerStock) {
        checkOuterStock(outerStock);
        return outerStockDao.add(outerStock);
    }

    /**
     * 按单一条件查询出库信息
     *
     * @param outerStock
     * @return
     */
    @Override
    public List<OuterStock> searchOuterStock(OuterStock outerStock) {
        checkOuterStock(outerStock);
        return outerStockDao.query(outerStock);
    }
    private void checkOuterStock(OuterStock outerStock){
        if (outerStock == null) {
            throw new NullPointerException("出库信息不能为空");
        }
    }
}
