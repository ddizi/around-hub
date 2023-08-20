package com.mj.around.hub.data.data.repository;

import com.mj.around.hub.data.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {
}
