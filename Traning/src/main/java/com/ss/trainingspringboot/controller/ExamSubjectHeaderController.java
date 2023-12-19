package com.ss.trainingspringboot.controller;

import com.ss.trainingspringboot.service.ExamSubjectHeaderService;
import flexjson.JSONSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/examSubjectHeader")
public class ExamSubjectHeaderController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ExamSubjectHeaderService examSubjectHeaderService;

    @GetMapping("/delete")
    public ResponseEntity<String> deleteExamSubjectHeaderById(@RequestParam(name = "id") Long id) {
        LOGGER.info("[START][ExamSubjectHeaderController][deleteExamSubjectHeaderById]");

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("ResponseCode", "0");

        try {
            examSubjectHeaderService.examSubjectHeaderDeleteById(id);

            LOGGER.info("[END][ExamSubjectHeaderController][deleteExamSubjectHeaderById]");
            return new ResponseEntity<String>(new JSONSerializer().deepSerialize("success"), httpHeaders, HttpStatus.OK);
        } catch (Exception e) {
            LOGGER.error("[CATCH][ExamSubjectHeaderController][deleteExamSubjectHeaderById][ERROR]");
            Map<String, String> result = new HashMap<>();
            result.put("ResponseCode", "-1");
            result.put("errMsg", e.getMessage());
            return new ResponseEntity<String>(new JSONSerializer().deepSerialize(result), httpHeaders, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
