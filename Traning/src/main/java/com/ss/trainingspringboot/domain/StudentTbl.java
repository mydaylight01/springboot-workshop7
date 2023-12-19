package com.ss.trainingspringboot.domain;

import lombok.CustomLog;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "WS7_GAS_STUDENT")
public class StudentTbl {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "g_student_id_increment")
    @SequenceGenerator(name = "g_student_id_increment", sequenceName = "G_STUDENT_ID_INCREMENT", allocationSize = 1)
    private Long id;

    @Column(length = 10)
    private String studentNumber;
    private String name;
    private String lastName;
}
