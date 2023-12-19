package com.ss.trainingspringboot.service.impl;

import com.ss.trainingspringboot.domain.ExamSubjectHeaderTbl;
import com.ss.trainingspringboot.model.request.ExamSubjectHeaderRequest;
import com.ss.trainingspringboot.model.response.ExamSubjectHeaderResponse;
import com.ss.trainingspringboot.service.Mapper.ExamSubjectHeaderMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExamSubjectHeaderMapperImpl implements ExamSubjectHeaderMapper {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Override
    public ExamSubjectHeaderTbl sourceToExamSubjectHeaderTbl(ExamSubjectHeaderRequest request) {
        return null;
    }

    @Override
    public ExamSubjectHeaderResponse examSubjectHeaderResponseToSource(ExamSubjectHeaderTbl examSubjectHeaderTbl) {
        return null;
    }
}
