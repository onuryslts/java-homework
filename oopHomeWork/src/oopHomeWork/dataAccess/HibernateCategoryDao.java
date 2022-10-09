package oopHomeWork.dataAccess;

import java.util.ArrayList;
import java.util.List;

import oopHomeWork.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
	private List<Category> categories = new ArrayList<>();
	@Override
	public void add(Category category) {
		categories.add(category);
		System.out.println("Hibernate Ile veritabanina eklendi");
		
	}
	@Override
	public List<Category> getAllCategories() {
		return categories;
	}

}
