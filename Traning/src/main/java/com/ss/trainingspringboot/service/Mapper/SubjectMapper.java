package com.ss.trainingspringboot.service.Mapper;

import com.ss.trainingspringboot.domain.SubjectTbl;
import com.ss.trainingspringboot.model.request.SubjectRequest;
import com.ss.trainingspringboot.model.response.SubjectResponse;

public interface SubjectMapper {
    SubjectTbl sourceToSubject(SubjectRequest request);
    SubjectResponse subjectToSource(SubjectTbl subjectTbl);
}