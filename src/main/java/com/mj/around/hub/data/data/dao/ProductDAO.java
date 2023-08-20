package com.mj.around.hub.data.data.dao;

import com.mj.around.hub.data.data.entity.ProductEntity;

public interface ProductDAO {

    ProductEntity saveProduct(ProductEntity productEntity);

    ProductEntity getProduct(String productId);
}
