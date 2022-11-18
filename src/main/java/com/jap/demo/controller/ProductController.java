package com.jap.demo.controller;

import com.jap.demo.domain.Product;
import com.jap.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/post")
    public ResponseEntity<?> saveMovie(@RequestBody Product product) {
        return new ResponseEntity<>(productService.save(product), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(productService.getAll(), HttpStatus.OK);
    }
}
