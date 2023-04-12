package com.groupfive.OnlineMovieTicketBooking.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Theater {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int theaterId;
	private String theaterDesc;
	private int capacity;
	@OneToMany	
	private List<TheaterCapacity> theatercapacity;
	
	public List<TheaterCapacity> getTheatercapacity() {
		return theatercapacity;
	}
	public void setTheatercapacity(List<TheaterCapacity> theatercapacity) {
		this.theatercapacity = theatercapacity;
	}
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public String getTheaterDesc() {
		return theaterDesc;
	}
	public void setTheaterDesc(String theaterDesc) {
		this.theaterDesc = theaterDesc;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
}
