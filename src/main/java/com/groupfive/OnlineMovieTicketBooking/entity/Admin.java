package com.groupfive.OnlineMovieTicketBooking.entity;

import java.sql.Date;

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

@Table(name="Admin")
public class Admin {
	@Id
	private String id;
	private String password;

}
