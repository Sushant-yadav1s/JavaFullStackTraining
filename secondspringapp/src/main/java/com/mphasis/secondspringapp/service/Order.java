package com.mphasis.secondspringapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {

    private final PaymentService paymentService;
    private final String orderId;

    // Constructor Injection (best practice)
    @Autowired   // optional in Spring 4.3+ because there's only one constructor
    public Order(PaymentService paymentService) {
        this.paymentService = paymentService;
        this.orderId = "ORD-" + System.currentTimeMillis();
    }

    public PaymentService getPaymentService() {
        return paymentService;
    }

    public String getOrderId() {
        return orderId;
    }

    public String placeOrder(double amount) {
        return "Order ID: " + orderId + " | " + paymentService.processPayment(amount);
    }
}