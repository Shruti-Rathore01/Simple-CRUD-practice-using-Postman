package com.practise.demo.controller;

import com.practise.demo.model.Product;
import com.practise.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @RequestMapping("/greet")
    public String greet()
    {
        return "New Hello";
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId)
    {
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProducts(@RequestBody Product prod)
    {
        service.addProducts(prod);
    }

    @PutMapping("/products")
    public void updateProducts(@RequestBody Product prod)
    {
        service.updateProducts(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteById(@PathVariable int prodId)
    {
        service.deleteById(prodId);
    }


}
