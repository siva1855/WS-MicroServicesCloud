package siva.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ms06CloudFeignClientLoadBalancingCartProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms06CloudFeignClientLoadBalancingCartProducerApplication.class, args);
		System.out.println("Eureka Client Executed");
	}

}
