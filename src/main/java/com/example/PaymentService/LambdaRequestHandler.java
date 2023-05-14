package com.example.PaymentService;



import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import org.springframework.stereotype.Component;

import java.util.function.Function;
//
//@Component
//public class LambdaRequestHandler
//        implements Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
//
//    @Override
//    public APIGatewayProxyResponseEvent apply(APIGatewayProxyRequestEvent proxyRequestEvent) {
//        APIGatewayProxyResponseEvent apiGatewayProxyResponseEvent=new APIGatewayProxyResponseEvent();
//        apiGatewayProxyResponseEvent.setStatusCode(200);
//        apiGatewayProxyResponseEvent.setBody("Hello i am "+proxyRequestEvent.getBody());
//        return apiGatewayProxyResponseEvent;
//    }
//}
