package com.groupfive.OnlineMovieTicketBooking.dtos;

import com.groupfive.OnlineMovieTicketBooking.entity.TheaterCapacity;

public class TheaterCapacityDTO extends TheaterCapacity {
	private int seatTypeId;
	private int theaterId;

	public int getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}

	public int getSeatTypeId() {
		return seatTypeId;
	}

	public void setSeatTypeId(int seatTypeId) {
		this.seatTypeId = seatTypeId;
	}
	
}
