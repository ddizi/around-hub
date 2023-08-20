package com.mj.around.hub.data.data.dto;

import com.mj.around.hub.data.data.entity.ProductEntity;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ProductDto {

    private String productId;
    private String productName;
    private String productPrice;
    private String productStock;

    public static ProductEntity toEntity(ProductDto productDto) {
        return ProductEntity.builder()
                .productId(productDto.getProductId())
                .productName(productDto.getProductName())
                .productPrice(productDto.getProductPrice())
                .productStock(productDto.getProductStock())
                .build();
    }
}
