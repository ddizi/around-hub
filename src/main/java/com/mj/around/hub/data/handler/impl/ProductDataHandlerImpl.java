package com.mj.around.hub.data.handler.impl;

import com.mj.around.hub.data.dao.ProductDAO;
import com.mj.around.hub.data.entity.ProductEntity;
import com.mj.around.hub.data.handler.ProductDataHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductDataHandlerImpl implements ProductDataHandler {

    private final ProductDAO productDAO;

    @Override
    public ProductEntity saveProduct(String productId, String productName, int productPrice, int productStock) {
        ProductEntity productEntity = ProductEntity.builder()
                .productId(productId)
                .productName(productName)
                .productPrice(productPrice)
                .productStock(productStock)
                .build();
        return productDAO.saveProduct(productEntity);
    }

    @Override
    public ProductEntity getProduct(String productId) {
        return productDAO.getProduct(productId);
    }
}
