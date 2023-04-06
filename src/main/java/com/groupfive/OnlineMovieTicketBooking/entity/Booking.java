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

@Table(name="Booking")
public class Booking {
	@Id
	private String id;
	private String userid;
	private String seatsbooked;
	private Integer screenid;
	private String movieid;
	private String theaterid;
	private String iscancelled;

}
