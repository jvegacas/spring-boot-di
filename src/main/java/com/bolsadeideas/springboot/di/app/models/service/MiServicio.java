package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("miServicioSimple")
public class MiServicio implements IServicio{
	
	public String miOperacion() {
		return "ejecutando algo importante y Simpleee ...";
	}

}
