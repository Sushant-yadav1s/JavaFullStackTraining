package com.mphasis.secondspringapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mphasis.secondspringapp.service.ProductService;

public class MainAppProduct {

public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(SpringConfig.class);

        ProductService productService = ctx.getBean(ProductService.class);

        productService.display();   
    }

}
