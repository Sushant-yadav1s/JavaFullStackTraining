package com.mphasis.secondspringapp.service;

import org.springframework.stereotype.Component;

@Component
public class ProductService {

    private final String productId;
    private final String name;
    private final double price;

   
    public ProductService() {
        this.productId = "P001";
        this.name = "Laptop";
        this.price = 999.99;
    }

   
    public void display() {
        System.out.println("Product ID : " + productId);
        System.out.println("Name       : " + name);
        System.out.println("Price      : " + price);
    }

   
}