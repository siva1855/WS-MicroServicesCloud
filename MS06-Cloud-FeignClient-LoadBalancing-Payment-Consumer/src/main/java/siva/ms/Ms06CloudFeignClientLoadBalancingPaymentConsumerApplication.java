package siva.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Ms06CloudFeignClientLoadBalancingPaymentConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms06CloudFeignClientLoadBalancingPaymentConsumerApplication.class, args);
		System.out.println("Eureka Client Executed");
		System.out.println("Fegin Client Executed");
	}

}
