package entitydao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import org.springframework.transaction.annotation.Transactional;

import entity.Student;

public class StudentDaoImpl implements StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public int insert(Student student) {
		int id=(Integer)this.hibernateTemplate.save(student);
		return id;
	}
	@Transactional
	public void update(Student student) {
		this.hibernateTemplate.update(student);
	}
	public Student get(int id) {
		return (Student) this.hibernateTemplate.get(Student.class, id);
	}
	public List<Student> getAll(){
		return this.hibernateTemplate.loadAll(Student.class);
	}
	@Transactional
	public void delete(int id) {
		Student student=this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(student);
	}

	
}
