package com.example.demo.entity;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
public class BugProject {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer projectId;
	
	@NotBlank
	@Size(max=50)
	@Pattern(regexp="^[a-zA-Z0-9 #*&%]*$")
	private String name;
	
	@NotBlank
	@Size(max=200)
	private String description;
	
	@OneToMany(mappedBy="bugProject")
	private List<Bug> bug =new ArrayList<>();
	
	public BugProject() {
		
	}

	public BugProject(Integer projectId, @NotBlank @Size(max = 50) @Pattern(regexp = "^[a-zA-Z0-9 #*&%]*$") String name,
			@NotBlank @Size(max = 200) String description) {
		super();
		this.projectId = projectId;
		this.name = name;
		this.description = description;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
