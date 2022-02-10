package com.example.demo.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Bug {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bugId;

	@NotBlank
	@Pattern(regexp = "^[a-zA-Z0-9]*$")
	private String owner;

	@NotBlank
	@Column(name = "owner_project")
	private String ownerProject;

	@NotBlank
	@Email
	private String email;

	@NotNull
	private Integer priority;

	@NotBlank
	private String status;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date")
	private Date createdDate = new Date();

	@NotNull
	private Date completionDate = new Date();

	@NotBlank
	@Size(max = 200)
	private String description;

	private String attachedFile;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "project_id", referencedColumnName = "projectId")
	private BugProject bugProject;

	public Bug() {

	}

	public Bug(Integer bugId, @NotBlank @Pattern(regexp = "^[a-zA-Z0-9]*$") String owner, @NotBlank String ownerProject,
			@NotBlank @Email String email, @NotNull Integer priority, @NotBlank String status,
			@NotNull Date createdDate, @NotNull Date completionDate, @NotBlank @Size(max = 200) String description,
			String attachedFile) {
		super();
		this.bugId = bugId;
		this.owner = owner;
		this.ownerProject = ownerProject;
		this.email = email;
		this.priority = priority;
		this.status = status;
		this.createdDate = createdDate;
		this.completionDate = completionDate;
		this.description = description;
		this.attachedFile = attachedFile;
	}

	public Integer getBugId() {
		return bugId;
	}

	public void setBugId(Integer bugId) {
		this.bugId = bugId;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwnerProject() {
		return ownerProject;
	}

	public void setOwnerProject(String ownerProject) {
		this.ownerProject = ownerProject;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAttachedFile() {
		return attachedFile;
	}

	public void setAttachedFile(String attachedFile) {
		this.attachedFile = attachedFile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BugProject getBugProject() {
		return bugProject;
	}

	public void setBugProject(BugProject bugProject) {
		this.bugProject = bugProject;
	}

}
