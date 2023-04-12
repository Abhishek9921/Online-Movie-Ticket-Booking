package com.groupfive.OnlineMovieTicketBooking.dtos;

import com.groupfive.OnlineMovieTicketBooking.entity.Shows;

public class ShowDTO extends Shows {

	private int theaterId;
	private int movieId;
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	@Override
	public String toString() {
		return "ShowDTO [theaterId=" + theaterId + ", movieId=" + movieId + "]";
	}
	
	
	
}
