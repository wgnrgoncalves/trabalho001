package br.com.fiap.wagner.trabalho001.trabalho001.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("index");
		
		return view;
	}
	

}
