package siva.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class InvoiceConsumerService {
	@Autowired
	private LoadBalancerClient loadBalancerClient;

	public String getInvoiceStatus() {
		String path = "/order/status";
		ServiceInstance serviceInstance = loadBalancerClient.choose("ORDER-PRODUCER");
		String uri = serviceInstance.getUri().toString();
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(uri + path, String.class);

		return "Invoice Consumer ===>>>>  " + responseEntity.getBody();
	}
}
