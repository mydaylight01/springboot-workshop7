package com.ss.trainingspringboot.service.impl;

import com.ss.trainingspringboot.repository.SubjectRepository;
import com.ss.trainingspringboot.repository.custom.SubjectRepositoryCustom;
import com.ss.trainingspringboot.service.SubjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private SubjectRepositoryCustom subjectRepositoryCustom;

}
