package com.ss.trainingspringboot.service.impl;

import com.ss.trainingspringboot.domain.StudentTbl;
import com.ss.trainingspringboot.model.request.StudentRequest;
import com.ss.trainingspringboot.model.response.StudentResponse;
import com.ss.trainingspringboot.repository.StudentRepository;
import com.ss.trainingspringboot.repository.custom.StudentRepositoryCustom;
import com.ss.trainingspringboot.service.Mapper.StudentMapper;
import com.ss.trainingspringboot.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentRepositoryCustom studentRepositoryCustom;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<StudentTbl> findByStudentNumberLike(String studentNumber) {
        return studentRepository.findByStudentNumberLike("%" + studentNumber + "%");
    }

    @Override
    public List<Map<String,Object>> findStudentNumberCustom(String keyword){
        return studentRepositoryCustom.findStudentNumberCustom(keyword);
    }

    @Override
    @Transactional
    public StudentResponse studentResponseSave(StudentRequest studentRequest) {
        LOGGER.info("[START][StudentServiceImpl][studentResponseSave]");

        try {
            StudentTbl studentTbl = studentMapper.sourceToStudentTbl(studentRequest); // convert request source to entity
            studentTbl = studentRepository.save(studentTbl); //save entity
            StudentResponse studentResponse = studentMapper.studentTblToSource(studentTbl); //convert entity to http response

            LOGGER.info("[END][StudentServiceImpl][studentResponseSave]");
            return studentResponse;
        } catch (Exception e) {
            LOGGER.error("[CATCH][StudentServiceImpl][studentResponseSave][ERROR]", e);

            throw new RuntimeException(e.getMessage());
        }
    }
}
