package siva.ms.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class AdminProducerService {

	@GetMapping("show")
	public String getMessage() {
		System.out.println("From Admin Producer Service");
		return "Welcome To All and from Producer Application";
	}
}
