package com.ss.trainingspringboot.model.response;

import lombok.Data;

@Data
public class StudentResponse {
    private Long id;
    private String studentNumber;
    private String name;
    private String lastName;
}
