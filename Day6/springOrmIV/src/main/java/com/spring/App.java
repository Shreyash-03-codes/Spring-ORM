package com.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Student;
import entitydao.StudentDao;

public class App {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("configuration/Configuration.xml");
        StudentDao studentDao=context.getBean("studentDaoImpl",StudentDao.class);
//        Student student =new Student();
//        student.setId(50);
//        student.setName("Rohan Mane");
//        student.setAddress("Sangola");
//        int id=studentDao.setStudent(student);
//        System.out.println(id);
        
//        Student student =new Student();
//        student.setId(50);
//        student.setName("Rohan Mane");
//        student.setAddress("Sangola,Bagalwadi");
//        studentDao.updateStudent(student);
        
        
        
//        Student student =studentDao.getStudent(50);
//        System.out.println(student);
        
//        studentDao.deleteStudent(50);
        
        List<Student> list=studentDao.getAllStudents();
        for(Student student:list) {
        	System.out.println(student);
        }
    }
}
