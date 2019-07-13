package com.mho.portfolio.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mho.portfolio.main.dao.TestDaoImpl;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	TestDaoImpl dao;
	
	@Override
	public String test() {
		return dao.test();
	}

}
