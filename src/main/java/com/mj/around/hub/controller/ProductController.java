package com.mj.around.hub.controller;

import com.mj.around.hub.data.dto.ProductDto;
import com.mj.around.hub.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/product-api")
@RequiredArgsConstructor
@Slf4j
public class ProductController {

    private final ProductService productService;

    @GetMapping("/product/{productId}")
    public ProductDto getProduct(@PathVariable String productId) {
        long start = System.currentTimeMillis();
        log.info("[ProductController] perform {} of Around Hub API", "getProduct");
        ProductDto productDto = productService.getProduct(productId);
        log.info("[ProductController] Response :: productId = {} productName = {} responseTime = {}ms", productId, productDto.getProductName(), System.currentTimeMillis() - start);
        return productDto;
    }

    @PostMapping("/product")
    public ProductDto createProduct(@RequestBody ProductDto productDto) {
        String productId = productDto.getProductId();
        String productName = productDto.getProductName();
        String productPrice = productDto.getProductPrice();
        String productStock = productDto.getProductStock();

        return productService.saveProduct(productId, productName, productPrice, productStock);
    }

    @DeleteMapping("/product/{productId}")
    public void deleteProduct(@PathVariable String productId) {
        productService.deleteProduct(productId);
    }
}
