package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.service.IServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicio;

@Controller
public class IndexController {
	
	@Autowired
//	@Qualifier("miServicioSimple")
	private IServicio servicio;
	
	@GetMapping({"/","","/index"})
	public String index(Model model) {
		model.addAttribute("resultado", servicio.miOperacion());
		return "index";
	}

}
