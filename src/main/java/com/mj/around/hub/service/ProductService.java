package com.mj.around.hub.service;

import com.mj.around.hub.data.dto.ProductDto;

public interface ProductService {
    ProductDto getProduct(String productId);
    ProductDto saveProduct(String productId, String productName, String productPrice, String productStock);
    void deleteProduct(String productId);
}
