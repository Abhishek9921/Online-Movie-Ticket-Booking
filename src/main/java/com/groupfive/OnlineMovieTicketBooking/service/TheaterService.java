package com.groupfive.OnlineMovieTicketBooking.service;

import org.springframework.stereotype.Service;

import com.groupfive.OnlineMovieTicketBooking.entity.Movie;

@Service
public interface TheaterService {

	Movie addmovie(Movie movie);

}
