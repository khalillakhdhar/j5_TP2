package com.projet.j5_TP2.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import data.Rappel;
import data.Todo;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response,Model m) throws IOException{
		Rappel r=new Rappel("teste", "teste", "teste");
		Todo t=new Todo();
		t.add(r);
		m.addAttribute("list",Todo.rappels);
		return new ModelAndView("home");

	}
	
	@RequestMapping(value="/",method = RequestMethod.POST)
	public String home(Model m, HttpServletRequest req)
	{
		String titre=req.getParameter("titre");
		String description=req.getParameter("description");
		String date=req.getParameter("date");
		Rappel r=new Rappel(titre, date, description) ;
		
		Todo t=new Todo();
		t.add(r);
		m.addAttribute("list",Todo.rappels);
		
		
		return "liste";
	}
	
	
}
