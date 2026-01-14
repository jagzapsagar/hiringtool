package com.storyonjava.hiringtool.service;

import org.springframework.stereotype.Service;

import com.storyonjava.hiringtool.entity.Applicant;
import com.storyonjava.hiringtool.entity.Job;
import com.storyonjava.hiringtool.repository.ApplicantRepository;
import com.storyonjava.hiringtool.repository.JobRepository;

@Service
public class JobApplicationService {
	private final ApplicantRepository applicantRepository;
	private final JobRepository jobRepository;

	public JobApplicationService(ApplicantRepository applicantRepository, JobRepository jobRepository) {
		this.applicantRepository = applicantRepository;
		this.jobRepository = jobRepository;
	}

	public void applyForJob(Long applicantId, Long jobId) {

		Applicant applicant = applicantRepository.findById(applicantId)
				.orElseThrow(() -> new RuntimeException("Applicant not found"));

		Job job = jobRepository.findById(jobId).orElseThrow(() -> new RuntimeException("Job not found"));

		// Owning side update (IMPORTANT)
		applicant.getAppliedJobs().add(job);

		applicantRepository.save(applicant);
	}

}
