//package com.ss.trainingspringboot;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//public class LOGGER_PATTERN {
//
//    String[] PATTERN = {"START", "IF", "ELIF", "ELSE", "END", "CATCH", "CLASS_NAME", "METHOD_NAME", "FOR", "FOR-END"};
//
//    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
//
//    public String methodName(String param) {
//        LOGGER.info("[START][LOGGER_PATTERN][methodName]");
//
//        try {
//            if (param.isEmpty()) {
//                LOGGER.info("[IF][methodName] = param.isEmpty()");
//
//                if(param == "") {
//                    LOGGER.info("[IF-IF][methodName] = param == \"\"");
//                }
//                else {
//                    LOGGER.info("[IF-ELSE][methodName]");
//
//                    if(param.isEmpty()) {
//                        LOGGER.info("[IF-ELSE-IF][methodName] = param.isEmpty()");
//
//                        //when return is in if-else add = PASS
//                        LOGGER.info("[END][methodName] = PASS");
//                    }
//                    //when return is not in if-else and fail to do something in if-else add = FAIL
//                }
//            }
//            else if (!param.isEmpty()) {
//                LOGGER.info("[ELIF][methodName] = !param.isEmpty()");
//            }
//            else {
//                LOGGER.info("[ELSE][methodName]");
//            }
//
//            LOGGER.info("[FOR][methodName] = Conditions");
//            for(int i=0; i<10; i++){
//
//            }
//            LOGGER.info("[FOR-END][methodName]");
//
//            LOGGER.info("[END][LOGGER_PATTERN][methodName]");
//            return null;
//        } catch (Exception e) {
//            LOGGER.info("[CATCH][LOGGER_PATTERN][methodName][ERROR]");
//
//            throw new RuntimeException(e.getMessage());
//        }
//    }
//}
