package com.etiya.northwind.api.controllers;

import com.etiya.northwind.Business.Abstracts.ProductService;
import com.etiya.northwind.Business.Responses.Products.ProductListResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductsController {
    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getAll")
    public List<ProductListResponse> getAll(){
        return this.productService.getAll();
    }


}
