package com.telusko.WebApp1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController 
{
	@GetMapping("/home")
	public String showHomePage()
	{
		return "home";
	}
	
	@GetMapping("/response")
	public String showSomeResponse(Model model)
	{
		String books[]=new String[] {"Java", "Junit5", "Spring Boot"};
		model.addAttribute("books", books);
		for(String booksName:books)
		{
			System.out.println(booksName);
		}
		
		return "response";
	}
   
}
