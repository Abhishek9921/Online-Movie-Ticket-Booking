package com.groupfive.OnlineMovieTicketBooking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupfive.OnlineMovieTicketBooking.repos.CustomerRepository;
import com.groupfive.OnlineMovieTicketBooking.dtos.LoginDTO;
import com.groupfive.OnlineMovieTicketBooking.entity.Customer;

@Service
public class CustomerService {

	@Autowired private CustomerRepository repo;
	
	public void saveCustomer(Customer customer) {
		repo.save(customer);
	}
	
	public List<Customer> listall(){
		return repo.findAll();
	}
	
	public Customer findById(int id) {
		return repo.getById(id);
	}
	
	public Customer validate(LoginDTO dto) {
		Customer customer=repo.findByEmail(dto.getCustomerid());
		if(customer!=null && customer.getPassword().equals(dto.getPassword())) {
			return customer;
		}
		return null;
	}
}
