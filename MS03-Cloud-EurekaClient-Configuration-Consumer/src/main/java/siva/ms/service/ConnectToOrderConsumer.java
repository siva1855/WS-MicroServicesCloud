package siva.ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ConnectToOrderConsumer {
	
	@Autowired
	private DiscoveryClient discoveryClient;

	public String connectToOrder() {
		RestTemplate restTemplate = new RestTemplate();
		List<ServiceInstance> listServiceInstances = discoveryClient.getInstances("ORDER-PRODUCER");
		ServiceInstance serviceInstance = listServiceInstances.get(0);
		String URL = serviceInstance.getUri() + "/producer/order";
		String responseMessage = restTemplate.getForObject(URL, String.class);
		return responseMessage;
	}
}
