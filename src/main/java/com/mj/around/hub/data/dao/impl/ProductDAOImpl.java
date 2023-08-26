package com.mj.around.hub.data.dao.impl;

import com.mj.around.hub.data.dao.ProductDAO;
import com.mj.around.hub.data.entity.ProductEntity;
import com.mj.around.hub.data.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
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
