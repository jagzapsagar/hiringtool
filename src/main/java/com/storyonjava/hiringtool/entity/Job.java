package com.storyonjava.hiringtool.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String location;

    @ManyToMany(mappedBy = "appliedJobs")
    private Set<Applicant> applicants;

    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
    private List<Interview> interviews;

	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Job(Long id, String title, String location, Set<Applicant> applicants, List<Interview> interviews) {
		super();
		this.id = id;
		this.title = title;
		this.location = location;
		this.applicants = applicants;
		this.interviews = interviews;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Applicant> getApplicants() {
		return applicants;
	}

	public void setApplicants(Set<Applicant> applicants) {
		this.applicants = applicants;
	}

	public List<Interview> getInterviews() {
		return interviews;
	}

	public void setInterviews(List<Interview> interviews) {
		this.interviews = interviews;
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", title=" + title + ", location=" + location + ", applicants=" + applicants
				+ ", interviews=" + interviews + "]";
	}
    
    
}
