package com.ss.trainingspringboot.service.impl;

import com.ss.trainingspringboot.domain.ExamSubjectDetailTbl;
import com.ss.trainingspringboot.domain.ExamSubjectHeaderTbl;
import com.ss.trainingspringboot.repository.ExamSubjectDetailRepository;
import com.ss.trainingspringboot.repository.ExamSubjectHeaderRepository;
import com.ss.trainingspringboot.repository.custom.ExamSubjectHeaderRepositoryCustom;
import com.ss.trainingspringboot.service.ExamSubjectHeaderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ExamSubjectHeaderServiceImpl implements ExamSubjectHeaderService {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ExamSubjectHeaderRepository examSubjectHeaderRepository;

    @Autowired
    private ExamSubjectHeaderRepositoryCustom examSubjectHeaderRepositoryCustom;

    @Autowired
    ExamSubjectDetailRepository examSubjectDetailRepository;

    @Override
    @Transactional
    public void examSubjectHeaderDeleteById(Long id) {
        LOGGER.info("[START][ExamSubjectHeaderServiceImpl][examSubjectHeaderDeleteById]");
        try {
            Optional<ExamSubjectHeaderTbl> examSubjectHeaderTblOptional = examSubjectHeaderRepository.findById(id);
            if(examSubjectHeaderTblOptional.isPresent()) {
                LOGGER.info("[IF] = examSubjectHeaderTbl.isPresent()");
                List<ExamSubjectDetailTbl> examSubjectDetailTbls = examSubjectHeaderTblOptional.get().getExamSubjectDetailTbl();
                examSubjectDetailRepository.deleteAll(examSubjectDetailTbls);
                examSubjectDetailRepository.flush();

                examSubjectHeaderRepository.delete(examSubjectHeaderTblOptional.get());
                LOGGER.info("[IF-END] = DELETE ID {} SUCCESS", examSubjectHeaderTblOptional.get().getId());
            }
            else {
                LOGGER.info("[ELSE] = ID NOT FOUND");
            }
        } catch (Exception e) {
            LOGGER.error("[CATCH][ExamSubjectHeaderServiceImpl][examSubjectHeaderDeleteById][ERROR]");
            throw new RuntimeException(e.getMessage());
        }
    }

//    @Override
//    @Transactional
//    public void examSubjectHeaderDeleteById(Long id) {
//        LOGGER.info("[START][ExamSubjectHeaderServiceImpl][examSubjectHeaderDeleteById]");
//
//        try {
//            ExamSubjectHeaderTbl examSubjectHeader = examSubjectHeaderRepository.findById(id)
//                    .orElseThrow(() -> new EntityNotFoundException("ExamSubjectHeaderTbl not found with id: " + id));
//
//            List<ExamSubjectDetailTbl> examSubjectDetailTbls = examSubjectHeader.getExamSubjectDetailTbl();
//
//            if (!examSubjectDetailTbls.isEmpty()) {
//                LOGGER.info("[INFO] Deleting associated ExamSubjectDetailTbl records");
//                examSubjectDetailRepository.deleteAll(examSubjectDetailTbls);
//                examSubjectDetailRepository.flush();
//            }
//
//            examSubjectHeaderRepository.delete(examSubjectHeader);
//            LOGGER.info("[IF-END] = DELETE SUCCESS");
//        } catch (Exception e) {
//            LOGGER.error("[CATCH][ExamSubjectHeaderServiceImpl][examSubjectHeaderDeleteById][ERROR]");
//            throw new RuntimeException("Error deleting ExamSubjectHeaderTbl with id: " + id, e);
//        }
//    }

}
