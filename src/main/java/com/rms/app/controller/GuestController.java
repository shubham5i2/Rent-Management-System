package com.rms.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rms.app.model.Guest;
import com.rms.app.service.GuestService;

@RestController
@RequestMapping("/api/guest")
public class GuestController {

	@Autowired
	private GuestService guestService;

	public GuestController(GuestService guestService) {
		super();
		this.guestService = guestService;
	}

	//save guest REST API
	@PostMapping()
	public ResponseEntity<Guest> saveGuest(@Valid @RequestBody Guest guest){
		return new ResponseEntity<Guest>(guestService.saveGuest(guest), HttpStatus.CREATED);
	}

}
