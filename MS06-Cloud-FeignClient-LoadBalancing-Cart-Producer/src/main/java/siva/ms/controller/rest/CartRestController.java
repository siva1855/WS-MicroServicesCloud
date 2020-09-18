package siva.ms.controller.rest;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import siva.ms.model.Cart;

@RestController
@RequestMapping("/cart")
public class CartRestController {
	
	@Value("${server.port}")
	private String port;

	@GetMapping("/info")
	public String getMessage() {
		return "CONSUMER -->> " + port;
	}

	@GetMapping("/oneProduct")
	public Cart getOneObject() {
		return new Cart(1, "Laptop", "LenovoV110", 3000.00);
	}

	@GetMapping("/allProducts")
	public List<Cart> getAllObjects() {
		return Arrays.asList(new Cart(101, "Laptop", "V110", 80000.00), new Cart(102, "Mobile", "MI6", 80000.00),
				new Cart(103, "Mouse", "HP110", 300.00), new Cart(104, "Bag", "Bag101", 500.00),
				new Cart(105, "Shoe", "Bata121", 1000.00));

	}
}
