package com.profesorp;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.profesorp.exception.BeanNotFoundException;



@RestController
public class ErrorResource {

	@Autowired
	MiBeanService service;
	
	@GetMapping("/get/{id}")
	public MiBean getBean(@PathVariable int id) {
		MiBean bean = null;
		try 
		{
			 bean = service.getBean(id);
		} catch (NoSuchElementException k)
		{
			throw new BeanNotFoundException("Bean con id: "+id+ " no encontrado" );
		}
		return bean;
	}
}
