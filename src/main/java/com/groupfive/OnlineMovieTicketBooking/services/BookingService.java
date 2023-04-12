package com.groupfive.OnlineMovieTicketBooking.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupfive.OnlineMovieTicketBooking.repos.BookingRepository;
import com.groupfive.OnlineMovieTicketBooking.dtos.BookingDTO;
import com.groupfive.OnlineMovieTicketBooking.dtos.ShowCheckDTO;
import com.groupfive.OnlineMovieTicketBooking.entity.Booking;

@Service
public class BookingService {

	@Autowired private BookingRepository repo;
	@Autowired private ShowsService sservice;
	@Autowired private SeatTypeService stservice;
	@Autowired private CustomerService cservice;
	
	public void save(BookingDTO dto) {
		Booking bk=new Booking();
		bk.setShowDate(dto.getBookDate());
		bk.setNoOfSeats(dto.getNoOfSeats());
		bk.setSeatnos(IntStream.of(dto.getSeatnums())
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", ")));
		bk.setCost(dto.getCost());
		bk.setShow(sservice.findById(dto.getShowId()));
		bk.setCustomer(cservice.findById(dto.getCustomerId()));
		repo.save(bk);
	}
	
	public List<Booking> listall(){
		return repo.findAll();
	}
	
	public List<Booking> allcustomerbooking(int id){
		return repo.findByCustomer(cservice.findById(id));
	}
	
	public Booking findById(int id) {
		return repo.getById(id);
	}
	
	public List<Booking> allOccupiedBookings(ShowCheckDTO dto){
		return repo.findByShowShowIdAndShowDate(dto.getShowid(), dto.getDate());
	}
	
	public void delete(int id) {
		Booking bk=repo.getById(id);
		bk.setStatus("Cancelled");
		bk.setCancelCharges((float) (bk.getCost()*.20));
		bk.setCost(0);
		repo.save(bk);
	}
}
