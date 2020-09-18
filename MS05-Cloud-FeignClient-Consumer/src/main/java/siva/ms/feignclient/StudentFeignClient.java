package siva.ms.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ORDER-PRODUCER")
public interface StudentFeignClient {
	
	@GetMapping("/order/status")
	public String getMessage();
}
