package com.example.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PatientPropsModel;

@RestController
@RequestMapping("/patients")
public class PatientsResource {

	@Autowired
	private Environment envs;

	@GetMapping("/")
	public PatientPropsModel getPatientsConfig() {
		return new PatientPropsModel(envs.getProperty("branch.name"), envs.getProperty("spring.application.name"),
				envs.getProperty("server.port"));
	}

}
