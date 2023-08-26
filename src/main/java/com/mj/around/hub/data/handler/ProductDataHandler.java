package com.mj.around.hub.data.handler;

import com.mj.around.hub.data.entity.ProductEntity;

public interface ProductDataHandler {

    ProductEntity saveProduct(String productId, String productName, String productPrice, String productStock);

    ProductEntity getProduct(String productId);
}
