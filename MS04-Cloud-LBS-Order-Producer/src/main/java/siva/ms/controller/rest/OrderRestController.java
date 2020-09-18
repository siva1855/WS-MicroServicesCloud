package siva.ms.controller.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderRestController {
	@Value("${server.port}")
	private String port;

	@GetMapping("/status")
	public String getOrderStatus() {
		return "Finished:\"Hello from Order Producer\" Running My Port Number : " + port;
	}
}
