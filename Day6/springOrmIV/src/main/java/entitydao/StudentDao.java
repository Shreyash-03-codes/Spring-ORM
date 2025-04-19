package entitydao;

import java.util.List;

import entity.Student;

public interface StudentDao {
	public int setStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(int id);
	public Student getStudent(int id);
	public List<Student> getAllStudents();
	
}
