package entitydao;

import java.util.List;

import entity.Student;

public interface StudentDao {
	public int insert(Student student);
	public void update(Student student);
	public Student get(int id);
	public List<Student> getAll();
	public void delete(int id);
}
