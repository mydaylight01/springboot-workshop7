package com.ss.trainingspringboot.model.request;

import lombok.Data;

@Data
public class StudentRequest {
    private Long id;
    private String studentNumber;
    private String name;
    private String lastName;
}