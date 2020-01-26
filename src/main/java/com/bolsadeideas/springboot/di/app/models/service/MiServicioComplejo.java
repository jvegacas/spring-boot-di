package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("miServicioComplejo")
@Primary
public class MiServicioComplejo implements IServicio{

	@Override
	public String miOperacion() {
		
		return "Esta ejecutando cosas importantes y Complejassss";
	}

}
