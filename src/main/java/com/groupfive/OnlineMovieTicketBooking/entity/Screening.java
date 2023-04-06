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

@Table(name="Screening")
public class Screening {
	@Id
	private String screenid;
	private String movieid;
    private Integer totalseats;
}
