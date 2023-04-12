package com.groupfive.OnlineMovieTicketBooking.dtos;

import com.groupfive.OnlineMovieTicketBooking.entity.Booking;

public class BookingDTO extends Booking {
	private int showId;
	private int customerId;
	private int seatTypeId;
	private int[] seatnums;
	
	public int[] getSeatnums() {
		return seatnums;
	}
	public void setSeatnums(int[] seatnums) {
		this.seatnums = seatnums;
	}
	public int getSeatTypeId() {
		return seatTypeId;
	}
	public void setSeatTypeId(int seatTypeId) {
		this.seatTypeId = seatTypeId;
	}
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

}
