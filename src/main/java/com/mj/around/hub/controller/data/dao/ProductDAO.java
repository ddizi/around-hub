package com.mj.around.hub.controller.data.dao;

import com.mj.around.hub.controller.data.entity.ProductEntity;

public interface ProductDAO {

    ProductEntity saveProduct(ProductEntity productEntity);

    ProductEntity getProduct(String productId);
}
