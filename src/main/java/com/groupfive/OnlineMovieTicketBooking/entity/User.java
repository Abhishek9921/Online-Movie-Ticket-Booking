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

@Table(name="User")
public class User {
	@Id
	private String userid;
	private String userpassword;

}
