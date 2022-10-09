package oopHomeWork.dataAccess;

import java.util.List;

import oopHomeWork.entities.Course;

public interface CourseDao {
	void add(Course course);
	public List<Course> getAllCourse();
	
}
