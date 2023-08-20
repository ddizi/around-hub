package com.mj.around.hub.data.data.dao.impl;

import com.mj.around.hub.data.data.dao.ProductDAO;
import com.mj.around.hub.data.data.entity.ProductEntity;
import com.mj.around.hub.data.data.repository.ProductRepository;
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
