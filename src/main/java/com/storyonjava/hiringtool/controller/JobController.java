package com.storyonjava.hiringtool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.storyonjava.hiringtool.entity.Job;
import com.storyonjava.hiringtool.service.JobService;

@RestController
@RequestMapping("/job")
public class JobController {
	
	@Autowired
	private JobService jobService;
	
	@PostMapping
	public Job addjob(@RequestBody Job job) {
		return jobService.AddJob(job);
		
	}

}
