package siva.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ms04CloudLbsInvoiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms04CloudLbsInvoiceConsumerApplication.class, args);
		System.out.println("Eureka Client Executed --->>>from Consumer");
	}

}
