package com.example.PaymentService;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.example.PaymentService.Repositoryy.PaymentRepository;
import com.example.PaymentService.entity.PaytmDetailPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
@RestController
public class pingController{

    @Autowired
    PaymentRepository paymentRepository;
    @GetMapping("/getOne")
    public List<PaytmDetailPojo> get()
    {
        return paymentRepository.paymentList();
    }

    @GetMapping("/get")
    public List<PaytmDetailPojo> getOne(@RequestParam  String name)
    {
        return paymentRepository.paymentList().stream().filter(s->s.getName().equals(name)).collect(Collectors.toList());
    }
}
