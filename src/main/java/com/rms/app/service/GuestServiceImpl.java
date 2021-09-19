package com.rms.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.app.dao.GuestDao;
import com.rms.app.model.Guest;

@Service
public class GuestServiceImpl implements GuestService {

	@Autowired
	private GuestDao guestDao;

	public GuestServiceImpl(GuestDao guestDao) {
		super();
		this.guestDao = guestDao;
	}

	@Override
	public Guest saveGuest(Guest guest) {
		return guestDao.save(guest);
	}

}
