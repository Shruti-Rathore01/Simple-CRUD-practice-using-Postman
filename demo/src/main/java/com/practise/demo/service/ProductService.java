package com.practise.demo.service;

import com.practise.demo.model.Product;
import com.practise.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProducts(@RequestBody Product prod) {
        repo.save(prod);
    }

    public void updateProducts(Product prod) {
        repo.save(prod);
    }

    public void deleteById(int prodId) {
        repo.deleteById(prodId);
    }
}
