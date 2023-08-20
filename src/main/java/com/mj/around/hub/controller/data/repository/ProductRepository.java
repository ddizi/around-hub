package com.mj.around.hub.controller.data.repository;

import com.mj.around.hub.controller.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {
}
