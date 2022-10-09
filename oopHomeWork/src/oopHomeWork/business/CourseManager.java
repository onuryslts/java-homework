package oopHomeWork.business;

import oopHomeWork.core.Logger;
import oopHomeWork.dataAccess.CourseDao;
import oopHomeWork.entities.Course;


public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	int sayac;
	public void add(Course course) throws Exception{
		for(Course c: courseDao.getAllCourse()) {
			if((c.getName()) == (course.getName())){
				 throw new Exception("BU KURS ZATEN VAR!!");
			}
		}
		if(course.getPrice()<0) {
			throw new Exception("Urun Fiyati 0'dan kucuk olamaz");
		}
		else if(course.getName() == ""){
			throw new Exception("Bilgilerinizi Eksik Girdiniz");
		}else {
			sayac++;
			System.out.println("\n"+sayac+".COURSE");
			System.out.println("--------------");
			courseDao.add(course);
			
			for(Logger logger : loggers) {
				logger.log(course.getName()+" "+course.getPrice());
			}
		}
		
	}
}
