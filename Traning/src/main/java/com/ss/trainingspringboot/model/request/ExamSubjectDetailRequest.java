package com.ss.trainingspringboot.model.request;

import com.ss.trainingspringboot.domain.ExamSubjectHeaderTbl;
import lombok.Data;

@Data
public class ExamSubjectDetailRequest {
    private Long id;
    private String examTimeStart;
    private String examTimeEnd;
    private String examTopic;
    private ExamSubjectHeaderTbl examSubjectHeaderTbl;
}
