package com.groupfive.OnlineMovieTicketBooking.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupfive.OnlineMovieTicketBooking.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	Customer findByEmail(String email);
}
