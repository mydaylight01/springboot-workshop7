package com.ss.trainingspringboot.repository;

import com.ss.trainingspringboot.domain.StudentTbl;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Map;

public interface StudentRepository extends JpaRepository<StudentTbl, Long> {
    List<StudentTbl> findByStudentNumberLike(String studentNumber);
}
