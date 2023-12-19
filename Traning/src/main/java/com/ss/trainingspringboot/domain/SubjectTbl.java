package com.ss.trainingspringboot.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "WS7_GAS_SUBJECT")
public class SubjectTbl {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "g_subject_id_increment")
    @SequenceGenerator(name = "g_subject_id_increment", sequenceName = "G_SUBJECT_ID_INCREMENT", allocationSize = 1)
    private Long id;

    @Column(length = 10)
    private String subjectCode;
    private String subjectName;
}
