package siva.ms.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("CART-PRODUCER")
public interface PaymentFeignClient {
	@GetMapping("/producer/cart")
	public String getInfo();
}
