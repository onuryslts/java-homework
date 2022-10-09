package oopHomeWork.dataAccess;

import java.util.List;

import oopHomeWork.entities.Instructor;

public interface InstructorDao {
	void add(Instructor instructor);
	public List<Instructor> getAllInstructors();

}
