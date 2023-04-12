package com.groupfive.OnlineMovieTicketBooking.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupfive.OnlineMovieTicketBooking.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
