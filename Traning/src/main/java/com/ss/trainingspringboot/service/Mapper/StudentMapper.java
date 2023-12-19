package com.ss.trainingspringboot.service.Mapper;

import com.ss.trainingspringboot.domain.StudentTbl;
import com.ss.trainingspringboot.model.request.StudentRequest;
import com.ss.trainingspringboot.model.response.StudentResponse;

public interface StudentMapper {
    StudentTbl sourceToStudentTbl(StudentRequest request);
    StudentResponse studentTblToSource(StudentTbl studentTbl);
}
