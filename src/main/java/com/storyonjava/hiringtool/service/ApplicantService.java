package com.storyonjava.hiringtool.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.storyonjava.hiringtool.entity.Applicant;
import com.storyonjava.hiringtool.repository.ApplicantRepository;

@Service
public class ApplicantService {
	private final ApplicantRepository repository;

    public ApplicantService(ApplicantRepository repository) {
        this.repository = repository;
    }

    public Applicant saveApplicant(Applicant applicant) {
        return repository.save(applicant);
    }
    
    public List<Applicant> getAllApplicants(){
    	return repository.findAll();
    }
    
    public ResponseEntity<Long> deleteById(Long id){
    	if(repository.existsById(id)) {
    		repository.deleteById(id);
    	}
    	
    	return new ResponseEntity<Long>(id, HttpStatus.OK);
    }
}
