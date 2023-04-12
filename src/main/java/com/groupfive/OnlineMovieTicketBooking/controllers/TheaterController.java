package com.groupfive.OnlineMovieTicketBooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupfive.OnlineMovieTicketBooking.dtos.TheaterCapacityDTO;
import com.groupfive.OnlineMovieTicketBooking.entity.Theater;
import com.groupfive.OnlineMovieTicketBooking.services.TheaterService;

@CrossOrigin
@RestController
@RequestMapping("/api/theater")
public class TheaterController {
	@Autowired private TheaterService service;

    @PostMapping("seats")
    public ResponseEntity<?> saveTheaterSeats(@RequestBody TheaterCapacityDTO tc){
        service.saveCapacity(tc);
        return ResponseEntity.ok().body("Theater Seats saved successfully");
    }
    
    @DeleteMapping("seats/{id}")
    public ResponseEntity<?> deleteSeat(@PathVariable("id") int id){
        service.deleteSeat(id);
        return ResponseEntity.ok("Seat deleted successfully");
    }
    
    @PostMapping
    public ResponseEntity<?> saveTheater(@RequestBody Theater theater){
        service.save(theater);
        return ResponseEntity.ok().body("Theater saved successfully");
    }

    @GetMapping
    public ResponseEntity<?> listall(){
        return ResponseEntity.ok(service.listall());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteTheater(@PathVariable("id") int id){
        service.deleteTheater(id);
        return ResponseEntity.ok("Theater deleted successfully");
    }

    @GetMapping("{id}")
    public ResponseEntity<?> findDetails(@PathVariable("id") int id){
        return ResponseEntity.ok().body(service.findById(id));
    }
}
