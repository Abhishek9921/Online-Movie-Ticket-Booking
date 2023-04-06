package com.groupfive.OnlineMovieTicketBooking;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.groupfive.OnlineMovieTicketBooking.controller com.groupfive.OnlineMovieTicketBooking.entity com.groupfive.OnlineMovieTicketBooking.exception com.groupfive.OnlineMovieTicketBooking.repository com.groupfive.OnlineMovieTicketBooking.service")
public class OnlineMovieTicketBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineMovieTicketBookingApplication.class, args);
	}

}
