package siva.ms.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import siva.ms.model.Cart;

@FeignClient(name = "CART-PRODUCER")
public interface PaymentFeignClient {
	
	@GetMapping("/cart/info")
	public String getInfo();

	@GetMapping("/cart/oneProduct")
	public Cart getOneObj();

	@GetMapping("/cart/allProducts")
	public List<Cart> getAllObjs();
}
