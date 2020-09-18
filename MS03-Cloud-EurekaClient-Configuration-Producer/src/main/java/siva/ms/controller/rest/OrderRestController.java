package siva.ms.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class OrderRestController {

	@GetMapping("/order")
	public String showOrderInfo() {
		return " your Order Details:- OrderId-101,System-Lenevo,RAM-8GB,Processor-i3(Producer) ";
	}
}
