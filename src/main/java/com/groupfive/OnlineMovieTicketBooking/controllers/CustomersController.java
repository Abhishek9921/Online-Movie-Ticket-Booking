package com.groupfive.OnlineMovieTicketBooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.groupfive.OnlineMovieTicketBooking.dtos.LoginDTO;
import com.groupfive.OnlineMovieTicketBooking.entity.Customer;
import com.groupfive.OnlineMovieTicketBooking.services.CustomerService;

@CrossOrigin
@RestController
@RequestMapping("/api/customers")
public class CustomersController {

	@Autowired private CustomerService service;

    @PostMapping
    public ResponseEntity<?> registerCustomer(@RequestBody Customer customer){
        service.saveCustomer(customer);
        return ResponseEntity.ok().body("Customer registered successfully");
    }
    
    @PostMapping("/validate")
    public ResponseEntity<?> validate(@RequestBody LoginDTO dto){
        Customer customer=service.validate(dto);
        if(customer!=null) {
            return ResponseEntity.ok(customer);
        } else {
            return ResponseEntity.badRequest().body("Invalid username or password");
        }
    }

    @GetMapping
    public ResponseEntity<?> listall(){
        return ResponseEntity.ok(service.listall());
    }

    @GetMapping("{id}")
    public ResponseEntity<?> findDetails(@PathVariable("id") int id){
        return ResponseEntity.ok().body(service.findById(id));
    }
}
