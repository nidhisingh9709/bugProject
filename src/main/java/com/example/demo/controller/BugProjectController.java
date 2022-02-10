package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BugProject;
import com.example.demo.service.BugProjectService;

@RestController
public class BugProjectController {

	@Autowired
	BugProjectService bugProjectService;
	
	@GetMapping("/project")
	public Iterable<BugProject> getProjects(){
		return bugProjectService.getProjects();
	}
	
	@PostMapping("/project")
	public void addProject(@RequestBody @Valid BugProject project) {
		bugProjectService.addProject(project);
	}
}
