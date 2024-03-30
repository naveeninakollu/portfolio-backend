package dev.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.portfolio.model.Model;
import dev.portfolio.repository.Repository1;
import dev.portfolio.service.Service;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
public class Controller {
	
	@Autowired
	private Service repo;
	
	
	@GetMapping("/")
	public List<Model> printName()
	{
		List<Model> list = repo.getAll();
		return list;
	}

}
