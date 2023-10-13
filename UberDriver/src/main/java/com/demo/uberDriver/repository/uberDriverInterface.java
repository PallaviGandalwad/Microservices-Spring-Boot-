package com.demo.uberDriver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.demo.uberDriver.beans.UberDriver;

//@Repository
@Service
public interface uberDriverInterface extends JpaRepository<UberDriver,Integer> {

}
