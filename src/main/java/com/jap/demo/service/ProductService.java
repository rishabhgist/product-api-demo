package com.jap.demo.service;

import com.jap.demo.domain.Product;
import com.jap.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
