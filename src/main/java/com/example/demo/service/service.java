package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.error.ResourceNotFoundException;
import com.example.demo.model.model;
import com.example.demo.repositry.repositry;

@Service
public class service {
@Autowired
public repositry rep;

public void save(model model) {
	rep.save(model);
	
}
public List<model> getAll(){
	return rep.findAll();
	
}
public void delete(long id) {
rep.deleteById(id);
}

public void update(long id, model model) throws ResourceNotFoundException{
	model cr=rep.findById(id) .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
	cr.setFirstName(model.getFirstName());
	cr.setLastName(model.getLastName());
	cr.setMobile(model.getMobile());
	cr.setCity(model.getCity());
	rep.save(cr);
}

public Optional<model> insert(long id) {
	 return rep.findById(id);
}
}
