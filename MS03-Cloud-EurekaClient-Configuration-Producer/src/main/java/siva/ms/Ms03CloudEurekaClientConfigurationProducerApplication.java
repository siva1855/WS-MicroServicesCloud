package siva.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ms03CloudEurekaClientConfigurationProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms03CloudEurekaClientConfigurationProducerApplication.class, args);
		System.out.println("Eureka Client Executed ---->>>from Producer");
	}

}
