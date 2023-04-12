package com.groupfive.OnlineMovieTicketBooking;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import com.groupfive.OnlineMovieTicketBooking.utils.FileUploadProperties;

@SpringBootApplication
@ComponentScan(basePackageClasses = OnlineMovieTicketBookingApplication.class)
@ComponentScan(basePackages = "com.groupfive.OnlineMovieTicketBooking.controller com.groupfive.OnlineMovieTicketBooking.dtos com.groupfive.OnlineMovieTicketBooking.entity com.groupfive.OnlineMovieTicketBooking.repos com.groupfive.OnlineMovieTicketBooking.services com.groupfive.OnlineMovieTicketBooking.utils ")

@EnableConfigurationProperties
({
    FileUploadProperties.class
})
public class OnlineMovieTicketBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineMovieTicketBookingApplication.class, args);
	}

}
