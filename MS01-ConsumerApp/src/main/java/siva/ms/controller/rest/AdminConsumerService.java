package siva.ms.controller.rest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AdminConsumerService implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://localhost:8181/producer/show",
				String.class);
		System.out.println(responseEntity.getBody());
		System.exit(0);

	}

}
