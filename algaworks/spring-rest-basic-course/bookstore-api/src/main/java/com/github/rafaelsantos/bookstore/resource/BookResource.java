package com.github.rafaelsantos.bookstore.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookResource {
	
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public String list() {
		return "Applicated REST, Git step-by-step";
	}
}
