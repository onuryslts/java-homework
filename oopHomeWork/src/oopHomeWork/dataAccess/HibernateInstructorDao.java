package oopHomeWork.dataAccess;

import java.util.ArrayList;
import java.util.List;

import oopHomeWork.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
	private List<Instructor> instructors = new ArrayList<>();
	@Override
	public void add(Instructor instructor) {
		 instructors.add(instructor);
		System.out.println("Hibernate Ile veritabanina eklendi");
		
		
	}
	@Override
	public List<Instructor> getAllInstructors() {
		return instructors;
	}

}
