package com.sanjay.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanjay.demo.dao.Customerrepo;
import com.sanjay.demo.model.Customer;

@RestController
public class CustomerController 
{
	@Autowired
	private Customerrepo repo;
	
	@GetMapping(path="/customers")
	public List<Customer> getCustomers()
	{
		System.out.println("###Inside customer controller");
		return repo.findAll();
	}
	
	@GetMapping(path="/customers/{cid}")
	public Optional<Customer> getCustomers(@PathVariable("cid")int cid)
	{
		System.out.println("###Inside get customer controller to find customer by customer id");
		return repo.findById(cid);
	}
	
	@DeleteMapping(path="/customer/{cid}")
	public String deleteCustomers(@PathVariable int cid)
	{
		System.out.println("###Inside Delete Customer controller");
		
		Customer c = repo.getOne(cid);
		
		
		repo.delete(c);
		
		return "Deleted";
	}

	
	@PostMapping(path="/customer")
	public Customer addCustomers(@RequestBody Customer customer)
	{
		System.out.println("###Inside Add controller");
		repo.save(customer);
		
		return customer;
	}
	
	@PutMapping(path="/customer", consumes= {"application/json"})
	public Customer saveorupdateCustomers(@RequestBody Customer customer)
	{
		System.out.println("###Inside addorupdateCustomers controller");
		repo.save(customer);
		
		return customer;
	}
	
	
}
