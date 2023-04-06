package com.groupfive.OnlineMovieTicketBooking.entity;


import java.sql.Timestamp;

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

@Table(name="Shows")
public class Shows {
	@Id
	private String showid;
	private Timestamp showtime;
}
