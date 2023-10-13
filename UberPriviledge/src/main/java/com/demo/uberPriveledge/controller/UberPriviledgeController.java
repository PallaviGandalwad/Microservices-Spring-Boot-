package com.demo.uberPriveledge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.uberPriveledge.bean.UberPriviledge;
import com.demo.uberPriveledge.repositery.uberPreviledgeInterface;

@RestController
@RequestMapping("/Priviledge")
public class UberPriviledgeController {
	@Autowired
	uberPreviledgeInterface upi;
	
	@PostMapping("/saveUP")
	public UberPriviledge saveUberPriviledge(@RequestBody UberPriviledge up1)
	{
		return upi.save(up1);
	}
	
	@GetMapping("/getUP/{x}")
	public UberPriviledge getUberPriviledge(@PathVariable Integer x)
	{
		return upi.findById(x).get();
	}

}
