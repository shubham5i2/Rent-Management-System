package com.rms.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rms.app.model.Guest;

@Repository
public interface GuestDao extends JpaRepository<Guest, Long> {

}
