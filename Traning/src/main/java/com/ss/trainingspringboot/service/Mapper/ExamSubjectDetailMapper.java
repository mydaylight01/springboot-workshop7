package com.ss.trainingspringboot.service.Mapper;

import com.ss.trainingspringboot.domain.ExamSubjectDetailTbl;
import com.ss.trainingspringboot.model.request.ExamSubjectDetailRequest;
import com.ss.trainingspringboot.model.response.ExamSubjectDetailResponse;

public interface ExamSubjectDetailMapper {
    ExamSubjectDetailTbl sourceToExamSubjectDetailTbl(ExamSubjectDetailRequest request);
    ExamSubjectDetailResponse ExamSubjectDetailTblToSource(ExamSubjectDetailTbl examSubjectDetailTbl);
}
