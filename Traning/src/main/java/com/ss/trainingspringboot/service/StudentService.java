package com.ss.trainingspringboot.service;

import com.ss.trainingspringboot.domain.StudentTbl;
import com.ss.trainingspringboot.model.request.StudentRequest;
import com.ss.trainingspringboot.model.response.StudentResponse;

import java.util.List;
import java.util.Map;

public interface StudentService {

    List<StudentTbl> findByStudentNumberLike(String studentNumber);

    StudentResponse studentResponseSave(StudentRequest studentRequest);

    List<Map<String, Object>> findStudentNumberCustom(String keyword);
}
