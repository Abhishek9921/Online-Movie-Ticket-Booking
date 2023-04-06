package com.groupfive.OnlineMovieTicketBooking.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor

@Table(name="Theater")
public class Theater {
	@Id
	private String theaterid;
	private String theatername;
    private String loction;
    private Integer totalscreen;
    private String theaterpassword;
}
