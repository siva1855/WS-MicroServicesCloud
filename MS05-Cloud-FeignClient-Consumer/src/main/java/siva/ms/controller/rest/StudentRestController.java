package siva.ms.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import siva.ms.feignclient.StudentFeignClient;

@RestController
@RequestMapping("/consumer")
public class StudentRestController {
	@Autowired
	private StudentFeignClient studentFeignClient;

	@GetMapping("/data")
	public String showData() {
		System.out.println(studentFeignClient.getClass().getName());
		return "Consumer====>>>" + studentFeignClient.getMessage();
	}
}
