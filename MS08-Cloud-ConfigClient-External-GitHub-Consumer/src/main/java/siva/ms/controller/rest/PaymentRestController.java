package siva.ms.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import siva.ms.feignclient.PaymentFeignClient;

@RestController
@RequestMapping("/consumer")
public class PaymentRestController {
	
	@Autowired
	private PaymentFeignClient paymentFeignClient;

	@GetMapping("/payment")
	public String ConsumeDate() {
		return paymentFeignClient.getInfo();
	}
}
