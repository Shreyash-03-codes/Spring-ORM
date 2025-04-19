package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Student;
import studentdao.StudentDaoImpl;

public class App {
    public static void main( String[] args ){
        System.out.println( "Here Spring ORM World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("configuration/Configuration.xml");
        StudentDaoImpl studentDao=context.getBean("studentDaoImpl",StudentDaoImpl.class);
        Student student=new Student();
        student.setId(19);
        student.setName("Yash Reddy");
        student.setRoll(37);
        int rs=studentDao.insert(student);
        System.out.println(rs>0?"Yes Student inserted":"No Student not Inserted");
    }
}
