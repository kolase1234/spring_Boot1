package com.rt.controller;

import org.apache.catalina.core.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.util.concurrent.Service;
import com.rt.Student_entities;
import com.rt.service.StdService;

@RestController
public class HomeController {
	
	@Autowired
    StdService SS;
	
	@PostMapping("/std")
	public String addstd(@RequestBody Student_entities e){
		SS.addStd(e);
		
		return "Added";
		
	}
	
	
}