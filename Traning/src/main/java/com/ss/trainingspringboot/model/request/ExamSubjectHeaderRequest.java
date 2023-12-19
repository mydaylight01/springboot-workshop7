package com.ss.trainingspringboot.model.request;

import com.ss.trainingspringboot.domain.ExamSubjectDetailTbl;
import com.ss.trainingspringboot.domain.StudentTbl;
import com.ss.trainingspringboot.domain.SubjectTbl;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ExamSubjectHeaderRequest {
    private Long id;
    private Date examDate;
    private StudentTbl studentTbl;
    private SubjectTbl subjectTbl;
    List<ExamSubjectDetailTbl> examSubjectDetailTbl;
}
