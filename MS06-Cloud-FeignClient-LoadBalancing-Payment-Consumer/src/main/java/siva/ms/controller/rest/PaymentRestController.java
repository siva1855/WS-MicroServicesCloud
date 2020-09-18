package siva.ms.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import siva.ms.feignclient.PaymentFeignClient;
import siva.ms.model.Cart;

@RestController
@RequestMapping("/payment")
public class PaymentRestController {
	@Autowired
	private PaymentFeignClient paymentFeignClient;

	@GetMapping("/msg")
	public String getMsg() {
		return paymentFeignClient.getInfo();
	}

	@GetMapping("/one")
	public Cart getOneRow() {
		return paymentFeignClient.getOneObj();
	}

	@GetMapping("/all")
	public List<Cart> getAllRows() {
		return paymentFeignClient.getAllObjs();
	}
}
