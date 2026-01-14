package com.storyonjava.hiringtool.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.storyonjava.hiringtool.entity.Interview;
import com.storyonjava.hiringtool.entity.Job;
import com.storyonjava.hiringtool.repository.InterviewRepository;
import com.storyonjava.hiringtool.repository.JobRepository;

@RestController
@RequestMapping("/jobs")
public class InterviewController {
	
	 private final JobRepository jobRepository;
	 private final InterviewRepository interviewRepository;
	public InterviewController(JobRepository jobRepository, InterviewRepository interviewRepository) {
		super();
		this.jobRepository = jobRepository;
		this.interviewRepository = interviewRepository;
	}
	 
	// POST /jobs/{jobId}/interviews
    @PostMapping("/{jobId}/interviews")
    public Interview createInterview(@PathVariable Long jobId,
                                      @RequestBody Interview interview) {

        Job job = jobRepository.findById(jobId)
                .orElseThrow(() -> new RuntimeException("Job not found"));

        // set job (ManyToOne side)
        interview.setJob(job);

        return interviewRepository.save(interview);
    }

}
