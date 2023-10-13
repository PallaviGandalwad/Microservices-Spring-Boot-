package com.demo.uber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.uber.beans.UberUser;
import com.demo.uber.repositery.uberUserInterface;
import com.demo.uber.valueAdded.AllData;
import com.demo.uber.valueAdded.UberDriver;
import com.demo.uber.valueAdded.UberPriviledge;

@RestController
@RequestMapping("/User")
public class UberUserController {
	@Autowired
	uberUserInterface uui;

	@PostMapping("/saveUU")
	public UberUser saveUberUser(@RequestBody UberUser u1) {
		return uui.save(u1);//means user will be saved at "u1" and same user will be returning back to your postman
		//now go to postman by default body >row>JSON and there you can write json 
		
	}
	
	@GetMapping("/getUU/{x}")
	public UberUser gateUberUser(@PathVariable Integer x) {
		return uui.findById(x).get(); 
		
	}
	

	@GetMapping("/getAllData/{x}")
	public AllData gateAllDataUberUser(@PathVariable Integer x) {
		RestTemplate rt = new RestTemplate();
		
		AllData all = new AllData();
		
		//UberUser
		UberUser uu= uui.findById(x).get();//user from jpa
		//all.setuUser(uui.findById(x).get());
		//all.setuUser(uu);
		
		
		
		//UberDriver
		UberDriver ud = rt.getForObject("http://localhost:8888/Driver/getUD/"+uu.getUberDriverId(),UberDriver.class);//using resttemplet we call this microservice
		//all.setuDriver(ud);
		
		//UberPriviledge
		UberPriviledge up = rt.getForObject("http://localhost:9999/Priviledge/getUP/"+uu.getUberPriviledgeId(),UberPriviledge.class);//using resttemplet we call this microservice
		//all.setuPriviledge(up);
		
		all.setuUser(uu);
		all.setuDriver(ud);
		all.setuPriviledge(up);

		return all; 
		
	}
}
