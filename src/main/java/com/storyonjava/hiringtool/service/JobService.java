package com.storyonjava.hiringtool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.storyonjava.hiringtool.entity.Job;
import com.storyonjava.hiringtool.repository.JobRepository;

@Service
public class JobService {
	
	@Autowired
	private JobRepository jobRepository;
	
	public Job AddJob(Job job) {
		jobRepository.save(job);
		return job;
	}

}
