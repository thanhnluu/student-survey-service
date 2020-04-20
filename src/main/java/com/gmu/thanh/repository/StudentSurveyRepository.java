package com.gmu.thanh.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.gmu.thanh.model.StudentSurvey;

@Repository
public interface StudentSurveyRepository extends CrudRepository<StudentSurvey, Integer> {}