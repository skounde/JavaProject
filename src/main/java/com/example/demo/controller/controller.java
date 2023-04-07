package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.error.ResourceNotFoundException;
import com.example.demo.model.model;
import com.example.demo.service.service;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class controller {
	@Autowired
	public service ser;
	private String status;

	@PostMapping("/insert")
	public ResponseEntity<model> insert(@ModelAttribute model mod) {
		ser.save(mod);
		return new ResponseEntity(HttpStatus.OK);

	}

	@GetMapping("/getall")
	public List<model> getcrud() {
		return ser.getAll();
	}

	@GetMapping("/get/{id}")
	public Optional<model> insertcrudid(@PathVariable long id) {
		return ser.insert(id);

	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable long id) {
		System.out.println("inside delete mapping ");
		ser.delete(id);
		return status = "delete success";
	}

	@PostMapping("/update/{id}")
	public String update(@PathVariable long id, @ModelAttribute model mode) throws ResourceNotFoundException {
		ser.update(id, mode);
		return status = "update success";
	}

}
