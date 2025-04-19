package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Student;
import studentdao.StudentDaoImpl;

public class App {
    public static void main( String[] args ){
        System.out.println( "Here is hibernate ORM...!!!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("configuration/Configuration.xml");
        StudentDaoImpl studentDaoImpl=context.getBean("studentDaoImpl",StudentDaoImpl.class);
        Student student=new Student();
        student.setAddress("Salegaon");
        student.setId(37);
        student.setName("Ram Gurav");
        int rs=studentDaoImpl.insert(student);
        System.out.println(rs+" Rows Inserted...!!!");
    }
}
