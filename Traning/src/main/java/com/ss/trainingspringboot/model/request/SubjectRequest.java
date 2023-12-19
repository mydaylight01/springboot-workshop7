package com.ss.trainingspringboot.model.request;

import lombok.Data;

@Data
public class SubjectRequest {
    private Long id;
    private String subjectCode;
    private String subjectName;
}
