package com.storyonjava.hiringtool.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.storyonjava.hiringtool.entity.Applicant;
import com.storyonjava.hiringtool.service.ApplicantService;

@RestController
@RequestMapping("/applicants")
public class ApplicantController {
	private final ApplicantService service;

    public ApplicantController(ApplicantService service) {
        this.service = service;
    }

    @PostMapping
    public Applicant create(@RequestBody Applicant applicant) {
    	System.out.println("------------------");
    	System.out.println(applicant);
        return service.saveApplicant(applicant);
    }
    
    @GetMapping
    public List<Applicant> GetAll(){
    	return service.getAllApplicants();
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Long> DeleteById(@PathVariable Long id) {
    	return service.deleteById(id);
    }
}
