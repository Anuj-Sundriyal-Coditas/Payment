package com.example.PaymentService;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PaymentServiceApplication {


//	@Bean
//	public Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> getResponse()
//	{
//		return value-> {
//			APIGatewayProxyResponseEvent responseEvent = new APIGatewayProxyResponseEvent();
//			responseEvent.setBody(value.getBody());
//			responseEvent.setStatusCode(201);
//			responseEvent.setHeaders(Collections.singletonMap("Content-type","application/json"));
//			return responseEvent;
//		};
//	}

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceApplication.class, args);
	}

}
