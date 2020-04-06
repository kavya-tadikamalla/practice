package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.*;
import com.example.demo.models.*;


@Controller
public class Controller1 
{
	@Autowired
	 private CourseDao coursedao;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
public String home()
{
	return "home";
}
	@RequestMapping(value="/log",method=RequestMethod.GET)
	public String login()
	{
		return "login";
	}
	@RequestMapping(value="/reg",method=RequestMethod.GET)
	public String register()
	{
		return "register";
	}
	@RequestMapping(value="/regcourse",method=RequestMethod.POST)
	public String courseReg(@ModelAttribute("course") Course course,Model model)
	{
		
		coursedao.save(course);
		return "home";
	}
	
}
