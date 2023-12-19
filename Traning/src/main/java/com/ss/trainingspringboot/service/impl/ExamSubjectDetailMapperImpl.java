package com.ss.trainingspringboot.service.impl;

import com.ss.trainingspringboot.domain.ExamSubjectDetailTbl;
import com.ss.trainingspringboot.model.request.ExamSubjectDetailRequest;
import com.ss.trainingspringboot.model.response.ExamSubjectDetailResponse;
import com.ss.trainingspringboot.service.Mapper.ExamSubjectDetailMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExamSubjectDetailMapperImpl implements ExamSubjectDetailMapper {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Override
    public ExamSubjectDetailTbl sourceToExamSubjectDetailTbl(ExamSubjectDetailRequest request) {
        return null;
    }

    @Override
    public ExamSubjectDetailResponse ExamSubjectDetailTblToSource(ExamSubjectDetailTbl examSubjectDetailTbl) {
        return null;
    }
}
