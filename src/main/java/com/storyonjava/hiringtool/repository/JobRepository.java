package com.storyonjava.hiringtool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.storyonjava.hiringtool.entity.Job;

public interface JobRepository extends JpaRepository<Job, Long> {

}
