package com.demo.uberPriveledge.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.uberPriveledge.bean.UberPriviledge;

@Repository
public interface uberPreviledgeInterface extends JpaRepository<UberPriviledge,Integer>{

}
