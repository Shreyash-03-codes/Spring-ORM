package entitydao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entity.Student;
@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
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
		
		this.hibernateTemplate.saveOrUpdate(student);
	}
	@Transactional
	public Student deleteStudent(int id) {
		Student student=this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(student);
		return student;
	}
	public Student getStudent(int id) {
		return this.hibernateTemplate.get(Student.class, id);
	}
	public List<Student> getAllStudents(){
		return this.hibernateTemplate.loadAll(Student.class);
	}
	
}
