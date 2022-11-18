package com.jap.demo.service;

import com.jap.demo.domain.Product;

import java.util.List;

public interface IProductService {
    Product save(Product product);

    List<Product> getAll();
}
