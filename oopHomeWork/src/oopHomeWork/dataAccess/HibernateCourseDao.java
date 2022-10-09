package oopHomeWork.dataAccess;

import java.util.ArrayList;
import java.util.List;

import oopHomeWork.entities.Course;


public class HibernateCourseDao implements CourseDao {
	private List<Course> courses = new ArrayList<>();
	@Override
	public void add(Course course) {
		courses.add(course);
		System.out.println("Hibernate Ile veritabanina eklendi");
		
	}
	@Override
	public List<Course> getAllCourse() {
		return courses;
	}

}
