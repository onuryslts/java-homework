package oopHomeWork.business;

import oopHomeWork.core.Logger;
import oopHomeWork.dataAccess.InstructorDao;
import oopHomeWork.entities.Instructor;


public class InstructorManager {
	
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	
public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}


int sayac;
public void add(Instructor instructor) throws Exception{
	for(Instructor i: instructorDao.getAllInstructors()) {
		if((i.getNationalityId()) == (instructor.getNationalityId())){
			 throw new Exception("BU KULLANICI ZATEN VAR!!");
		}
	}
	if(instructor.getFirstName() == "" ||instructor.getLastName() == ""  || instructor.getNationalityId() == "" ) {
		throw new Exception("Bilgilerinizi Eksik Girdiniz");
	}else{
		sayac++;
		System.out.println("\n"+sayac+".INSTRUCTOR");
		System.out.println("--------------");
		instructorDao.add(instructor);
		
	for(Logger logger : loggers) {
		logger.log(instructor.getFirstName()+" "+instructor.getLastName()+" "+instructor.getNationalityId());
	}
  }
 }	
}
