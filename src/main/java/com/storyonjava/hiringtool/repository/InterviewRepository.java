package com.storyonjava.hiringtool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.storyonjava.hiringtool.entity.Interview;

public interface InterviewRepository extends JpaRepository<Interview, Long> {

}
