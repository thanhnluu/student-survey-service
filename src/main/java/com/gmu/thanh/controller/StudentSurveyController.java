package com.gmu.thanh.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmu.thanh.model.StudentSurvey;
import com.gmu.thanh.service.StudentSurveyService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/studentsurvey")
public class StudentSurveyController {

	@Autowired
	private StudentSurveyService studentSurveyService;

	@GetMapping(path = "/{id}")
	public ResponseEntity<StudentSurvey> getStudentSurveyById(@PathVariable("id") Integer id){
		StudentSurvey studentSurvey = studentSurveyService.findById(id);	
		return new ResponseEntity<>(studentSurvey, HttpStatus.OK);
	}

	@GetMapping(path = "/studentsurveys")
	public ResponseEntity<ArrayList<StudentSurvey>> getAllStudentSurveys(){
		ArrayList<StudentSurvey> studentSurveys = studentSurveyService.findAll();
		return new ResponseEntity<>(studentSurveys, HttpStatus.OK);
	}

	@GetMapping(path = "/count")
	public ResponseEntity<Long> getCount(){	
		return new ResponseEntity<>(studentSurveyService.count(), HttpStatus.OK);
	}
	
	@DeleteMapping()
	public ResponseEntity<String> deleteAll(){
		studentSurveyService.deleteAll();
		return new ResponseEntity<>("success", HttpStatus.OK);
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<String> deleteStudentSurveyById(@PathVariable("id") Integer id){
		studentSurveyService.deleteById(id);	
		return new ResponseEntity<>("success", HttpStatus.OK);
	}

	@PostMapping(path = "/create")
	public ResponseEntity<String> createStudentSurvey(@RequestBody StudentSurvey studentSurvey){
		studentSurveyService.createStudentSurvey(studentSurvey);
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
}
