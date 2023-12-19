package com.ss.trainingspringboot.service.impl;

import com.ss.trainingspringboot.domain.SubjectTbl;
import com.ss.trainingspringboot.model.request.SubjectRequest;
import com.ss.trainingspringboot.model.response.SubjectResponse;
import com.ss.trainingspringboot.service.Mapper.SubjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubjectMapperImpl implements SubjectMapper {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Override
    public SubjectTbl sourceToSubject(SubjectRequest request) {
        return null;
    }

    @Override
    public SubjectResponse subjectToSource(SubjectTbl subjectTbl) {
        return null;
    }
}
