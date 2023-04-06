package com.groupfive.OnlineMovieTicketBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupfive.OnlineMovieTicketBooking.entity.Movie;
import com.groupfive.OnlineMovieTicketBooking.service.TheaterService;


@RestController
@RequestMapping("/theater")
public class TheaterController {
	
	@Autowired
	private TheaterService theaterService;
	

	
	}
}

