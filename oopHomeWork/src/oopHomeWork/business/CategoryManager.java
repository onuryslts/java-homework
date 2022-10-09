package oopHomeWork.business;

import oopHomeWork.core.Logger;
import oopHomeWork.dataAccess.CategoryDao;
import oopHomeWork.entities.Category;


public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	int sayac;
	public void add(Category category) throws Exception{
		for(Category c: categoryDao.getAllCategories()) {
			if((c.getName()) == (category.getName())){
				 throw new Exception("BU CATEGORY ZATEN VAR!!");
			}
		}
		if(category.getName() == "" ||category.getDescription()=="") {
			throw new Exception("Bilgilerinizi Eksik Girdiniz");
		}else {
			for(Category c : categoryDao.getAllCategories()) {
				if(c.getName().equals(category.getName())) {
				   throw new Exception("Category zaten var!");
				}
			}
			sayac++;
			System.out.println("\n"+sayac+".CATEGORY");
			System.out.println("--------------");
			categoryDao.add(category);
			for(Logger logger : loggers) {
				logger.log(category.getName()+" "+category.getDescription());
			}
	}
}
}
