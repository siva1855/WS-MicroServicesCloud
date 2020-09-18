package siva.ms.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import siva.ms.service.ConnectToOrderConsumer;

@RestController
@RequestMapping("/consumer")
public class PaymentConsumerRestController {

	@Autowired
	private ConnectToOrderConsumer connectToOrderConsumer;

	@GetMapping("/payment")
	public String consumerDate() {
		return "From Payment(Consumer)::::>>> " + connectToOrderConsumer.connectToOrder();

	}
}
