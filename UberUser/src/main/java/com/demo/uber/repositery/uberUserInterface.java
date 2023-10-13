package com.demo.uber.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.uber.beans.UberUser;

@Repository //so that ur springContainer will also create object of this perticular uberUserInterface interface
//and we will get that runtime in UberUSerController as-> uberUserInterface uui; apply annotation @Autowired and save everything 
//now ur free to use jpa methods now we only returning in UberUSerController by writting in saveUberUser() method return uu1.saveUU(u1)
public interface uberUserInterface extends JpaRepository<UberUser, Integer> {

}
