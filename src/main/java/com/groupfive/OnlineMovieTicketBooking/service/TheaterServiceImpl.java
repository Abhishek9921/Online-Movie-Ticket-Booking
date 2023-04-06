package com.groupfive.OnlineMovieTicketBooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupfive.OnlineMovieTicketBooking.entity.Movie;
import com.groupfive.OnlineMovieTicketBooking.repository.MovieRepository;

@Service
public class TheaterServiceImpl implements TheaterService {
	
	@Autowired
	private MovieRepository movieRepository;

	@Override
	public Movie addmovie(Movie movie) {
		return movie = movieRepository.save(movie);
		
	}

}
