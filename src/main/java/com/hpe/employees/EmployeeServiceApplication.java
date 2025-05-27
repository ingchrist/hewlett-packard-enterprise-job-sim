package com.hpe.employees;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class EmployeeServiceApplication {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EmployeeServiceApplication.class, args);
        logger.info("Employee Service Application started successfully.");
        System.setProperty("logging.level", "DEBUG");
    }
}
