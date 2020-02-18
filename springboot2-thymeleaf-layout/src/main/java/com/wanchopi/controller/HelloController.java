package com.wanchopi.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * The application controller
 * 
 * @author Wanchopi
 *
 */
@Controller
public class HelloController {
	
	@RequestMapping("/")
	public ModelAndView home() {
		Map<String, Object> myMap = new HashMap<String, Object>();
		String now = "Hello World";
		int day = LocalDateTime.now().getDayOfMonth();
		int month = LocalDateTime.now().getMonthValue();
		int year = LocalDateTime.now().getYear();
		String date = month + "/" + day + "/" + year;
		myMap.put("now", now);
		myMap.put("date", date);
		ModelAndView mav = new ModelAndView("index", "myModel", myMap);
		return mav;
	}
	
}
