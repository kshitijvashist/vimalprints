package com.hotel.management.kshitij.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hotel")
public class HotelController {
	
	Logger logger=LoggerFactory.getLogger(HotelController.class);
	
	@RequestMapping("/mainPage")
	public String loadMainPage()
	{
		try
		{
		logger.info("main Page has been loaded.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "index";
	}
	
//	@PostMapping("/selectedPage")
//	public String getSelectedPage(@ModelAttribute("HotelPage") Hotel hotel)
//	{
//		return "index";
//	}
//	
	
	
	
	
	

}
