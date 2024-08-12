package com.demo.foodo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.demo.foodo.exception.ResourceNotFoundException;
import com.demo.foodo.model.Customer;
import com.demo.foodo.repository.CustomerRepository;

@RestController
@RequestMapping("/foodo/v1/")
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository;
	
	@GetMapping("/CustomerList")
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}
	
	@PostMapping("/AddCustomer")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}
	
	@GetMapping("/Customer/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable Integer id) {
		Customer customer = customerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Customer not found with id : "+id));
		return ResponseEntity.ok(customer);
		
	}
}
