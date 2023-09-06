package com.mj.around.hub.data.dto;

import com.mj.around.hub.data.entity.ProductEntity;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ProductDto {

    @NotNull
    private String productId;
    @NotNull
    private String productName;
    @NotNull
    @Min(value = 500)
    @Max(value = 30000000)
    private int productPrice;
    @NotNull
    @Min(value = 0)
    @Max(value = 9999)
    private int productStock;

    public static ProductEntity toEntity(ProductDto productDto) {
        return ProductEntity.builder()
                .productId(productDto.getProductId())
                .productName(productDto.getProductName())
                .productPrice(productDto.getProductPrice())
                .productStock(productDto.getProductStock())
                .build();
    }
}
