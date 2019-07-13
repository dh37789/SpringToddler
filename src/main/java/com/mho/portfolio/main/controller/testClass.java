package com.mho.portfolio.main.controller;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mho.portfolio.main.service.TestServiceImpl;
@Controller
public class testClass {

	@Inject
	TestServiceImpl testService;
	
	@RequestMapping("index")
	public String index(Locale locale, Model model) {
		
		String str = testService.test();
		model.addAttribute("test", str);
		
		return "index";
	}
}
