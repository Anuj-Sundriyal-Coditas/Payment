package com.example.PaymentService.Repositoryy;

import com.example.PaymentService.entity.PaytmDetailPojo;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class PaymentRepository {
    public List<PaytmDetailPojo> paymentList()
    {
        return Arrays.asList(
                new PaytmDetailPojo(1,"Anuj","Dehradun"),
                new PaytmDetailPojo(2,"Usman","Up"),
                new PaytmDetailPojo(3,"Zulfa","Pune")
        );
    }
}
