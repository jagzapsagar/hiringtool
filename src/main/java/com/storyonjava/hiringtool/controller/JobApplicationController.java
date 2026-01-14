package com.storyonjava.hiringtool.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.storyonjava.hiringtool.service.JobApplicationService;

@RestController
@RequestMapping("/applicants")
public class JobApplicationController {
	private final JobApplicationService service;

	public JobApplicationController(JobApplicationService service) {
		this.service = service;
	}

	// PUT /applicants/{applicantId}/apply/{jobId}
	@PutMapping("/{applicantId}/apply/{jobId}")
	public String applyForJob(@PathVariable Long applicantId, @PathVariable Long jobId) {

		service.applyForJob(applicantId, jobId);
		return "Applicant applied for job successfully";
	}
}
