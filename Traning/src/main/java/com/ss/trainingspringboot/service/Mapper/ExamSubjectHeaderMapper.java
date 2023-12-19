package com.ss.trainingspringboot.service.Mapper;

import com.ss.trainingspringboot.domain.ExamSubjectHeaderTbl;
import com.ss.trainingspringboot.model.request.ExamSubjectHeaderRequest;
import com.ss.trainingspringboot.model.response.ExamSubjectHeaderResponse;

public interface ExamSubjectHeaderMapper {
    ExamSubjectHeaderTbl sourceToExamSubjectHeaderTbl(ExamSubjectHeaderRequest request);
    ExamSubjectHeaderResponse examSubjectHeaderResponseToSource(ExamSubjectHeaderTbl examSubjectHeaderTbl);
}
