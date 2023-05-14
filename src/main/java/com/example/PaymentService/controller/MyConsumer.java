package com.example.PaymentService.controller;

import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class MyConsumer implements Consumer<String> {
    @Override
    public void accept(String o) {
     System.out.println(o);
    }
}
