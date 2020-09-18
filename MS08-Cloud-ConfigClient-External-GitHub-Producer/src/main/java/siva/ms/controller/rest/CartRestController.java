package siva.ms.controller.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class CartRestController {
	
	@Value("${my.application.name}")
	private String gitData;

	@GetMapping("/cart")
	public String showMessage() {
		return "My Company Name =====>>>" + gitData;
	}
}
