package com.gmu.thanh.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmu.thanh.model.StudentSurvey;
import com.gmu.thanh.repository.StudentSurveyRepository;

@Service
public class StudentSurveyService {

	@Autowired
	private StudentSurveyRepository studentSurveyRepository;

	public ArrayList<StudentSurvey> findAll() {
		Iterable<StudentSurvey> it = studentSurveyRepository.findAll();
		ArrayList<StudentSurvey> studentSurveys = new ArrayList<StudentSurvey>();
		it.forEach(e -> studentSurveys.add(e));
		return studentSurveys;
	}

	public Long count() {
		return  studentSurveyRepository.count();
	}

	public void deleteById(Integer id) {
		studentSurveyRepository.deleteById(id);
	}
	
	public void deleteAll(){
		studentSurveyRepository.deleteAll();
	}
	
	public void createStudentSurvey(StudentSurvey studentSurvey){
		studentSurveyRepository.save(studentSurvey);
	}
	
	public StudentSurvey findById(Integer id){
		return studentSurveyRepository.findById(id).orElse(null);
	}
}
