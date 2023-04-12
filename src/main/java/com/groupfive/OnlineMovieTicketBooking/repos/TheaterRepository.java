package com.groupfive.OnlineMovieTicketBooking.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupfive.OnlineMovieTicketBooking.entity.Theater;

@Repository
public interface TheaterRepository extends JpaRepository<Theater, Integer> {

}
