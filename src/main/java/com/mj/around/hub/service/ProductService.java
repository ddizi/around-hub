package com.mj.around.hub.service;

import com.mj.around.hub.data.dto.ProductDto;

public interface ProductService {
    ProductDto getProduct(String productId);
    ProductDto saveProduct(String productId, String productName, int productPrice, int productStock);
    void deleteProduct(String productId);
}
