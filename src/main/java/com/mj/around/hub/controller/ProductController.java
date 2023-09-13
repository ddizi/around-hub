package com.mj.around.hub.controller;

import com.mj.around.hub.common.Constatnts;
import com.mj.around.hub.common.exception.AroundHubException;
import com.mj.around.hub.data.dto.ProductDto;
import com.mj.around.hub.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
    public ProductDto createProduct(@Valid @RequestBody ProductDto productDto) {
        String productId = productDto.getProductId();
        String productName = productDto.getProductName();
        int productPrice = productDto.getProductPrice();
        int productStock = productDto.getProductStock();

        return productService.saveProduct(productId, productName, productPrice, productStock);
    }

    @DeleteMapping("/product/{productId}")
    public void deleteProduct(@PathVariable String productId) {
        productService.deleteProduct(productId);
    }

    @PostMapping("/product/exception")
    public void exceptionTest() throws AroundHubException {
        throw new AroundHubException(Constatnts.ExceptionClass.PRODUCT, HttpStatus.FORBIDDEN, "접근 금지!!!");
    }
}
