package com.groupfive.OnlineMovieTicketBooking.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupfive.OnlineMovieTicketBooking.repos.TheaterCapacityRepository;
import com.groupfive.OnlineMovieTicketBooking.repos.TheaterRepository;
import com.groupfive.OnlineMovieTicketBooking.dtos.TheaterCapacityDTO;
import com.groupfive.OnlineMovieTicketBooking.entity.Theater;
import com.groupfive.OnlineMovieTicketBooking.entity.TheaterCapacity;

@Service
public class TheaterService {
	@Autowired private TheaterRepository repo;
	@Autowired private TheaterCapacityRepository tcrepo;
	@Autowired private SeatTypeService sservice;
	
	public void saveCapacity(TheaterCapacityDTO dto) {
		TheaterCapacity tc=new TheaterCapacity();
		BeanUtils.copyProperties(dto, tc);
		tc.setSeatType(sservice.findById(dto.getSeatTypeId()));
		Theater theater=repo.getById(dto.getTheaterId());
		tc.setTheater(theater);
		
		TheaterCapacity tcc= tcrepo.save(tc);
		List<TheaterCapacity> tcs= theater.getTheatercapacity();
		tcs.add(tcc);
		theater.setTheatercapacity(tcs);
		repo.save(theater);
	}
	
	public void deleteSeat(int id) {
		TheaterCapacity tc=tcrepo.getById(id);
		Theater theater=tc.getTheater();
		List<TheaterCapacity> tcs= theater.getTheatercapacity();
		tcs.remove(tc);
		repo.save(theater);
		tcrepo.delete(tc);
	}

	public void save(Theater theater) {
		repo.save(theater);
	}

	public List<Theater> listall(){
		return repo.findAll();
	}

	public Theater findById(int id) {
		return repo.getById(id);
	}

	public void deleteTheater(int id) {
		repo.delete(repo.getById(id));
	}
}
