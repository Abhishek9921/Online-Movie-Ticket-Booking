package com.groupfive.OnlineMovieTicketBooking.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupfive.OnlineMovieTicketBooking.entity.Theater;
import com.groupfive.OnlineMovieTicketBooking.entity.TheaterCapacity;

@Repository
public interface TheaterCapacityRepository extends JpaRepository<TheaterCapacity, Integer> {
	
	List<TheaterCapacity> findByTheater(Theater theater);

}
