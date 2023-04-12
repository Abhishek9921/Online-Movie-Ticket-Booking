package com.groupfive.OnlineMovieTicketBooking.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupfive.OnlineMovieTicketBooking.repos.ShowsRepository;
import com.groupfive.OnlineMovieTicketBooking.dtos.SearchDTO;
import com.groupfive.OnlineMovieTicketBooking.dtos.ShowDTO;
import com.groupfive.OnlineMovieTicketBooking.entity.Shows;

@Service
public class ShowsService {

	@Autowired private ShowsRepository repo; 
	@Autowired private MovieService mservice;
	@Autowired private TheaterService hservice;
	@Autowired private SearchSpecification ssp;
	
	public void save(ShowDTO dto) {
		Shows show=new Shows();
		BeanUtils.copyProperties(dto, show);
		show.setTheater(hservice.findById(dto.getTheaterId()));
		show.setMovie(mservice.findById(dto.getMovieId()));
		repo.save(show);
	}
	
	public List<Shows> listall(){
		return repo.findAll();
	}
	
	public List<Shows> todayShows(){
		return repo.todaysShow();
	}
	
	public List<Shows> searchShows(SearchDTO dto){
		return repo.findAll(ssp.getfilteredShows(dto));
	}
	
	public Shows findById(int id) {
		return repo.getById(id);
	}
	
	public void deleteShow(int id) {
		repo.delete(repo.getById(id));
	}
}
