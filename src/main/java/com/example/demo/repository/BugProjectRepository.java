package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.BugProject;

public interface BugProjectRepository extends CrudRepository<BugProject, Integer> {

}
