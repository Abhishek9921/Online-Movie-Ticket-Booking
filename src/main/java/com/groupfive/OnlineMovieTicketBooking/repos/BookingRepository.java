package com.groupfive.OnlineMovieTicketBooking.repos;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupfive.OnlineMovieTicketBooking.entity.Booking;
import com.groupfive.OnlineMovieTicketBooking.entity.Customer;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
	
	List<Booking> findByCustomer(Customer customer);
	List<Booking> findByShowShowIdAndShowDate(int showid,LocalDate date);

}
