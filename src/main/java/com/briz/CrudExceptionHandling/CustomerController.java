package com.briz.CrudExceptionHandling;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
	CustomerRepository crepo;
	
	@PostMapping("/save")
	public Customer save(@RequestBody Customer c)
	{
		return crepo.save(c);
	}
	
	@GetMapping("/all")
	public List<Customer> all()
	{
		return crepo.findAll();
	}

}
