package entitydao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import entity.Student;

public class StudentDaoImpl implements StudentDao{
	private HibernateTemplate hibernateTemplate;

	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	

	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public int setStudent(Student student) {
		return (Integer)this.hibernateTemplate.save(student);
	}
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}
	@Transactional
	public void deleteStudent(int id) {
		Student student=this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(student);
	}
	public Student getStudent(int id) {
		Student student=this.hibernateTemplate.get(Student.class, id);
		return student;
	}
	public List<Student> getAllStudents(){
		return this.hibernateTemplate.loadAll(Student.class);
	}
	
}
