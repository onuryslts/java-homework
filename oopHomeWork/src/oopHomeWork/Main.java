package oopHomeWork;

import oopHomeWork.business.CategoryManager;
import oopHomeWork.business.CourseManager;
import oopHomeWork.business.InstructorManager;
import oopHomeWork.core.DatabaseLogger;
import oopHomeWork.core.FileLogger;
import oopHomeWork.core.Logger;
import oopHomeWork.core.MailLogger;
import oopHomeWork.core.SmsLogger;
import oopHomeWork.dataAccess.HibernateCategoryDao;
import oopHomeWork.dataAccess.HibernateCourseDao;
import oopHomeWork.dataAccess.JdbcInstructorDao;
import oopHomeWork.entities.Category;
import oopHomeWork.entities.Course;
import oopHomeWork.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Instructor instructor1 = new Instructor(1, "Engin","Demirog", "12345678999");
		Instructor instructor2 = new Instructor(2, "Onur","Yesiltas", "12345678998");
		
		Logger[] loggers = 
			{new DatabaseLogger(),new FileLogger(),new MailLogger(),new SmsLogger()};
		
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(),loggers);
		instructorManager.add(instructor1);
		instructorManager.add(instructor2);
		
		Category category1 = new Category(1, "WEB PROGRAMLAMA", "Web tasarim hakkinda her sey!");
		Category category2 = new Category(2, "MOBIL PROGRAMLAMA", "Mobil programlama hakkinda her sey!");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);
		categoryManager.add(category2);
		
		Course course1 = new Course(1, "C++ Kursu", 5);
		Course course2 = new Course(2, "C# Kursu", 0);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);
		courseManager.add(course2);
		
		
	}
}
