package dev.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dev.portfolio.repository.Repository1;
import dev.portfolio.model.Model;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	public Repository1 repo;
	
	public List<Model> getAll(){
		return repo.findAll();
	}

}
