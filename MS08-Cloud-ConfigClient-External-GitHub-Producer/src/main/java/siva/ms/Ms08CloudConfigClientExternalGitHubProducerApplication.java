package siva.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ms08CloudConfigClientExternalGitHubProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms08CloudConfigClientExternalGitHubProducerApplication.class, args);
		System.out.println("Executed Eureka Client----->>from ProducerApp");

	}

}
