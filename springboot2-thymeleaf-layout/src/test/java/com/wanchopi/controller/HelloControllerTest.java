package com.wanchopi.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller class Test
 * @author Wanchopi
 *
 */
@SpringBootTest
public class HelloControllerTest {
	
	@Autowired
	private HelloController controller;

	private Map<String, Object> myMap = new HashMap<String, Object>();
	
	
	@Test
	public void testHome() {
		ModelAndView mav = controller.home();
		assertNotNull(mav);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testGreeting() {
		ModelAndView mav = controller.home();
		myMap = (Map<String, Object>) mav.getModel().get("myModel");
		String greeting = (String) myMap.get("now");
		assertEquals("Hello World", greeting);
	}

}
