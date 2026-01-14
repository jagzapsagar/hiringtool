package com.storyonjava.hiringtool.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Interview {
	  	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String roundName;

	    @ManyToOne
	    @JoinColumn(name = "job_id")
	    @JsonIgnore
	    private Job job;

		public Interview() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Interview(Long id, String roundName, Job job) {
			super();
			this.id = id;
			this.roundName = roundName;
			this.job = job;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getRoundName() {
			return roundName;
		}

		public void setRoundName(String roundName) {
			this.roundName = roundName;
		}

		public Job getJob() {
			return job;
		}

		public void setJob(Job job) {
			this.job = job;
		}

		@Override
		public String toString() {
			return "Interview [id=" + id + ", roundName=" + roundName + ", job=" + job + "]";
		}
	    
	    
}
