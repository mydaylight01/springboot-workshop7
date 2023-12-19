package com.ss.trainingspringboot.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "WS7_GAS_SUBJECT_HEADER")
public class ExamSubjectHeaderTbl {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "g_exam_header_id_increment")
    @SequenceGenerator(name = "g_exam_header_id_increment", sequenceName = "G_EXAM_HEADER_ID_INCREMENT", allocationSize = 1)
    private Long id;

    @JsonFormat(pattern = "dd-MM-yyyy")
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Date examDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STUDENT")
    private StudentTbl studentTbl;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SUBJECT")
    private SubjectTbl subjectTbl;

    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "examSubjectHeaderTbl")
    List<ExamSubjectDetailTbl> examSubjectDetailTbl;
}
