package com.storyonjava.hiringtool.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "resume_id")
    private Resume resume;

    @ManyToMany
    @JoinTable(
        name = "applicant_job",
        joinColumns = @JoinColumn(name = "applicant_id"),
        inverseJoinColumns = @JoinColumn(name = "job_id")
    )
    private Set<Job> appliedJobs;

	public Applicant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Applicant(Long id, String name, String email, Resume resume, Set<Job> appliedJobs) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.resume = resume;
		this.appliedJobs = appliedJobs;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Resume getResume() {
		return resume;
	}

	public void setResume(Resume resume) {
		this.resume = resume;
	}

	public Set<Job> getAppliedJobs() {
		return appliedJobs;
	}

	public void setAppliedJobs(Set<Job> appliedJobs) {
		this.appliedJobs = appliedJobs;
	}

	@Override
	public String toString() {
		return "Applicant [id=" + id + ", name=" + name + ", email=" + email + ", resume=" + resume + ", appliedJobs="
				+ appliedJobs + "]";
	}
    
    
}
