package siva.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Ms08CloudConfigClientExternalGitHubConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms08CloudConfigClientExternalGitHubConsumerApplication.class, args);
	System.out.println("Executed Eureka and Feign Cients-------->from Consumer");
	
	}

}
