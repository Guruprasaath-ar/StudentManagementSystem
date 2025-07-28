package org.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.student.model.StudentManagementService;

@SpringBootApplication
public class Main {

    public static void start(StudentManagementService studentManagementService, ApplicationContext applicationContext) {
        studentManagementService.start(applicationContext);
    }

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Main.class, args);
        start((StudentManagementService) context.getBean(org.student.model.StudentManagementService.class),context);
    }
}