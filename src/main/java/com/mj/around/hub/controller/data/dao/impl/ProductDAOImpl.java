package com.mj.around.hub.controller.data.dao.impl;

import com.mj.around.hub.controller.data.dao.ProductDAO;
import com.mj.around.hub.controller.data.entity.ProductEntity;
import com.mj.around.hub.controller.data.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductDAOImpl implements ProductDAO {

        private final ProductRepository productRepository;

        @Override
        public ProductEntity saveProduct(ProductEntity productEntity) {
            return productRepository.save(productEntity);
        }

        @Override
        public ProductEntity getProduct(String productId) {
            return productRepository.findById(productId).orElse(null);
        }
}
