package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.ConfigurationFile;
import entity.Student;
import entitydao.StudentDao;

public class App {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationFile.class);
        StudentDao studentDao=context.getBean("getStudentDao",StudentDao.class);
//        Student student=new Student();
//        student.setId(36);
//        student.setName("Shreyash Gurav");
//        student.setAddress("Salegaon");
//        studentDao.updateStudent(student);
//        System.out.println(rs+" Inserted...!!!");
        System.out.println(studentDao.getStudent(36));
    }
}
