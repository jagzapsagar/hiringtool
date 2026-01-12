package com.storyonjava.hiringtool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.storyonjava.hiringtool.entity.Resume;

public interface ResumeRepository extends JpaRepository<Resume, Long> {

}
