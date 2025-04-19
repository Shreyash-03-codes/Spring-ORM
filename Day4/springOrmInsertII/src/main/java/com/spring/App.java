package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Student;
import studentdao.StudentDao;
import studentdao.StudentDaoImpl;

public class App {
    public static void main( String[] args ){
        System.out.println( "Here is Hibernate Program...!!!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("configuration/Configuration.xml");
        StudentDao studentDaoImpl=context.getBean("studentDaoImpl" , StudentDao.class);
        Student student=new Student();
        student.setId(36);
        student.setName("Shreyash gurav");
        student.setAddress("Salegaon");
        int id=studentDaoImpl.insert(student);
        System.out.println("The data is Inserted...!!! the id is "+id);
        
    }
}
