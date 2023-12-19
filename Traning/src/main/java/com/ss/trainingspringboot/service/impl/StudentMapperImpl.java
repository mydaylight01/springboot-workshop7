package com.ss.trainingspringboot.service.impl;

import com.ss.trainingspringboot.domain.StudentTbl;
import com.ss.trainingspringboot.model.request.StudentRequest;
import com.ss.trainingspringboot.model.response.StudentResponse;
import com.ss.trainingspringboot.repository.StudentRepository;
import com.ss.trainingspringboot.service.Mapper.StudentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class StudentMapperImpl implements StudentMapper {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentTbl sourceToStudentTbl(StudentRequest request) {
        LOGGER.info("[START][StudentMapperImpl][sourceToStudentTbl]");

        try {
            StudentTbl studentTbl = new StudentTbl(); // create StudentTbl object to return StudentTbl

            if(request.getId() != null){
                LOGGER.info("[IF] = request.getId() != null");

                Optional<StudentTbl> studentTblOptional = studentRepository.findById(request.getId());
                if(studentTblOptional.isPresent()){
                    LOGGER.info("[IF-IF] = studentTblOptional.isPresent()");

                    studentTbl = studentTblOptional.get();
                }
            }
            studentTbl.setName(request.getName());
            studentTbl.setLastName(request.getLastName());
            studentTbl.setStudentNumber(request.getStudentNumber());

            LOGGER.info("[END][StudentMapperImpl][sourceToStudentTbl]");

            return studentTbl;
        } catch (Exception e) {
            LOGGER.error("[CATCH][StudentMapperImpl][sourceToStudentTbl][ERROR]");

            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public StudentResponse studentTblToSource(StudentTbl studentTbl) {
        LOGGER.info("[START][StudentMapperImpl][studentTblToSource]");

        try {
            StudentResponse studentResponse = new StudentResponse();

            studentResponse.setId(studentTbl.getId());
            studentResponse.setName(studentTbl.getName());
            studentResponse.setLastName(studentTbl.getLastName());
            studentResponse.setStudentNumber(studentTbl.getStudentNumber());

            LOGGER.info("[END][StudentMapperImpl][studentTblToSource]");
            return studentResponse;
        } catch (Exception e) {
            LOGGER.error("[CATCH][StudentMapperImpl][studentTblToSource][ERROR]");

            throw new RuntimeException(e.getMessage());
        }
    }
}
