package com.ss.trainingspringboot.repository;

import com.ss.trainingspringboot.domain.SubjectTbl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface SubjectRepository extends JpaRepository<SubjectTbl, Long> {
//    @Query("SELECT o FROM SubjectTbl o WHERE o.subjectCode =:subjectCode ")
//    List<SubjectTbl> findBySubjectCodeCustom(String subjectCode);
}
