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

@Table(name="Customer")
public class Customer {
	@Id
	private String customerid;
	private String customerpassword;
    private String customername;
    private Integer contact;
    private Date customerdob;
    private String email;
}

