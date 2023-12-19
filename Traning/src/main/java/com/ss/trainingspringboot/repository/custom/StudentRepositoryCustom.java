package com.ss.trainingspringboot.repository.custom;

import com.ss.trainingspringboot.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepositoryCustom{
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @PersistenceContext
    private EntityManager entityManager;

    public List<Map<String, Object>> findStudentNumberCustom(String keyword) {
        LOGGER.info("[START][StudentRepositoryCustom][findStudentNumberNative]");
        List<Map<String, Object>> result = new ArrayList<>();

        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT id, student_Number, name, last_Name \n")
                    .append("FROM WS7_GAS_STUDENT \n")
                    .append("WHERE student_Number LIKE :keyword \n");
            Query query = entityManager.createNativeQuery(stringBuilder.toString());
            query.setParameter("keyword", "%" + keyword + "%");

            List<Object[]> responseList = query.getResultList();
            if(responseList.size() > 0) {
                LOGGER.info("[IF][findStudentNumberNative] = responseList.size() > 0");

                LOGGER.info("[FOR][findStudentNumberNative] = Object[] fetchResponse : responseList");
                Map<String, Object> fetchMap;
                for (Object[] fetchResponse : responseList){
                    fetchMap = new HashMap<>();
                    fetchMap.put("id", fetchResponse[0]);
                    fetchMap.put("studentNumber", fetchResponse[1]);
                    fetchMap.put("name", fetchResponse[2]);
                    fetchMap.put("lastName", fetchResponse[3]);

                    result.add(fetchMap);
                }
                LOGGER.info("[FOR-END][findStudentNumberNative]");
            }
            LOGGER.info("[END][findStudentNumberNative]");
            return result;
        } catch (Exception e) {
            LOGGER.error("[CATCH][StudentRepositoryCustom][findStudentNumberNative][ERROR]");
            throw new RuntimeException(e.getMessage());
        }
    }
}
