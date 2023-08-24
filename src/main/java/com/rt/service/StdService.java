package com.rt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.fasterxml.jackson.core.format.InputAccessor.Std;
import com.rt.Student_entities;
import com.rt.Dao.StdDao;

@Component
public class StdService {
	
	@Autowired
    StdDao dao;

	public void addStd(Student_entities e) {
		
		dao.save(e);
	}
	
	

	

}
