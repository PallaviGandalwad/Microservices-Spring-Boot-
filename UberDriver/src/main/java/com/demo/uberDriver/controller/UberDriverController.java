package com.demo.uberDriver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody; dont use ResponseBody insted of RequestBody be careful
import org.springframework.web.bind.annotation.RestController;

import com.demo.uberDriver.beans.UberDriver;
import com.demo.uberDriver.repository.uberDriverInterface;

@RestController
@RequestMapping("/Driver")
public class UberDriverController {
	
	@Autowired
	uberDriverInterface ubi;
	
	@PostMapping("/saveUD")
	public UberDriver saveUberDriver(@RequestBody UberDriver ud1 ) {
		
		return ubi.save(ud1);
	}
	
	@GetMapping("/getUD/{x}")
	public UberDriver gateUberUser(@PathVariable Integer x) {
		return ubi.findById(x).get(); 
		
	}
	
}
