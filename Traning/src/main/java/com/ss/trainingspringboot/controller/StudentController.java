package com.ss.trainingspringboot.controller;

import com.ss.trainingspringboot.domain.StudentTbl;
import com.ss.trainingspringboot.model.request.StudentRequest;
import com.ss.trainingspringboot.model.response.StudentResponse;
import com.ss.trainingspringboot.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentService studentService;

    @GetMapping("/findByStudentNumber")
    public List<StudentTbl> findByStudentNumberLike(@RequestParam(value = "studentNumber") String studentNumber) {
        LOGGER.info("[START][StudentController][findByStudentNumberLike]");
        try {
            LOGGER.info("[END][StudentController][findByStudentNumberLike]");
            return studentService.findByStudentNumberLike(studentNumber);
        } catch (Exception e) {
            LOGGER.error("[CATCH][StudentController][findByStudentNumberLike][ERROR]");
            throw new RuntimeException(e.getMessage());
        }
    }

    @GetMapping("/findByStudentNumberCustom")
    public List<Map<String,Object>> findStudentNumberNative(@RequestParam(value = "studentNumber") String studentNumber) {
        LOGGER.info("[START][StudentController][findStudentNumberNative]");
        try {
            LOGGER.info("[END][StudentController][findStudentNumberNative]");
            return studentService.findStudentNumberCustom(studentNumber);
        } catch (Exception e) {
            LOGGER.error("[CATCH][StudentController][findStudentNumberByNative][ERROR]");
            throw new RuntimeException(e.getMessage());
        }
    }

    @PostMapping("/save")
    public StudentResponse studentResponseSave(@RequestBody StudentRequest studentRequest){
        LOGGER.info("[START][StudentController][studentResponseSave]");
        try {
            return studentService.studentResponseSave(studentRequest);
        } catch (Exception e) {
            LOGGER.error("[CATCH][StudentController][studentResponseSave][ERROR]");
            throw new RuntimeException(e.getMessage());
        }
    }
}
