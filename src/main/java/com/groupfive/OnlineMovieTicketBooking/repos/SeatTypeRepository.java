package com.groupfive.OnlineMovieTicketBooking.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupfive.OnlineMovieTicketBooking.entity.SeatType;

@Repository
public interface SeatTypeRepository extends JpaRepository<SeatType, Integer> {

}
