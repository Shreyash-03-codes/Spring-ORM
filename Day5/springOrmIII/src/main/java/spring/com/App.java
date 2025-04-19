package spring.com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Student;
import entitydao.StudentDao;
import entitydao.StudentDaoImpl;

public class App {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("configuration/Configuration.xml");
        StudentDao studentDao=context.getBean("studentDaoImpl",StudentDao.class);
//        Student student=new Student();
//        student.setId(58);
//        student.setName("Pratik Patil");
//        student.setAddress("Kagal");
//        int rs=studentDao.insert(student);
//        System.out.println(rs);
//        Student student=studentDao.get(58);
//        System.out.println(student);
//        Student student=new Student();
//      student.setId(58);
//      student.setName("Pratik Patil");
//      student.setAddress("Kagal, Pimpalgaon");
//      studentDao.update(student);
//        List<Student> list=studentDao.getAll();
//        for(Student student:list) {
//        	System.out.println(student);
//        }
//        s
        studentDao.delete(58);
    }
}
