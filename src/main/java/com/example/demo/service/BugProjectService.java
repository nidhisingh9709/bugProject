package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BugProject;
import com.example.demo.repository.BugProjectRepository;

@Service
public class BugProjectService {

	@Autowired
	BugProjectRepository bugProjectRepository;

	public Iterable<BugProject> getProjects() {
		// TODO Auto-generated method stub
		return bugProjectRepository.findAll();
	}

	public void addProject( @Valid BugProject project) {
		// TODO Auto-generated method stub
		bugProjectRepository.save(project);
	}
}
