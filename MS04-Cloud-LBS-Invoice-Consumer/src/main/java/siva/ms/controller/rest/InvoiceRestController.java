package siva.ms.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import siva.ms.service.InvoiceConsumerService;

@RestController
@RequestMapping("/invoice")
public class InvoiceRestController {
	@Autowired
	private InvoiceConsumerService invoiceConsumerService;

	@GetMapping("/info")
	public String getInvoiceInfo() {
		return invoiceConsumerService.getInvoiceStatus();
	}
}
