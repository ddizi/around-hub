package com.mj.around.hub.service.impl;

import com.mj.around.hub.data.dto.ProductDto;
import com.mj.around.hub.data.handler.ProductDataHandler;
import com.mj.around.hub.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductDataHandler productDataHandler;

    @Override
    public ProductDto saveProduct(String productId, String productName, int productPrice, int productStock) {
        return productDataHandler.saveProduct(productId, productName, productPrice, productStock).toDto();
    }

    @Override
    public ProductDto getProduct(String productId) {
        return productDataHandler.getProduct(productId).toDto();
    }

    @Override
    public void deleteProduct(String productId) {

    }
}
