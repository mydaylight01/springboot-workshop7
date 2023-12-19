package com.ss.trainingspringboot.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "WS7_GAS_SUBJECT_DETAIL")
public class ExamSubjectDetailTbl {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "g_exam_subject_id_increment")
    @SequenceGenerator(name = "g_exam_subject_id_increment", sequenceName = "G_EXAM_SUBJECT_ID_INCREMENT", allocationSize = 1)
    private Long id;

    private String examTimeStart;
    private String examTimeEnd;
    private String examTopic;

    @ManyToOne
    @JoinColumn(name = "SUBJECT_HEADER")
    private ExamSubjectHeaderTbl examSubjectHeaderTbl;
}
