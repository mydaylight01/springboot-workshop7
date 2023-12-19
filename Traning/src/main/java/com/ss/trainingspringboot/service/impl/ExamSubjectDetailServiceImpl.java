package com.ss.trainingspringboot.service.impl;

import com.ss.trainingspringboot.domain.ExamSubjectDetailTbl;
import com.ss.trainingspringboot.repository.ExamSubjectDetailRepository;
import com.ss.trainingspringboot.repository.custom.ExamSubjectDetailRepositoryCustom;
import com.ss.trainingspringboot.service.ExamSubjectDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExamSubjectDetailServiceImpl implements ExamSubjectDetailService {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ExamSubjectDetailRepository examSubjectDetailRepository;

    @Autowired
    private ExamSubjectDetailRepositoryCustom examSubjectDetailRepositoryCustom;

    @Override
    public void examSubjectDetailDeleteById(Long id) {
        LOGGER.info("[START][ExamSubjectDetailServiceImpl][examSubjectDetailDeleteById]");
        try {
            Optional<ExamSubjectDetailTbl> examSubjectDetailTblOptional = examSubjectDetailRepository.findById(id);
            if (examSubjectDetailTblOptional.isPresent()) {
                LOGGER.info("[IF] = examSubjectDetailTblOptional.isPresent()");
                examSubjectDetailRepository.delete(examSubjectDetailTblOptional.get());
                LOGGER.info("[IF-END] = DELETE ID {} SUCCESS", examSubjectDetailTblOptional.get().getId());
            }
        } catch (Exception e) {
            LOGGER.error("[CATCH][ExamSubjectDetailServiceImpl][examSubjectDetailDeleteById][ERROR]");
            throw new RuntimeException(e.getMessage());
        }
    }
}
