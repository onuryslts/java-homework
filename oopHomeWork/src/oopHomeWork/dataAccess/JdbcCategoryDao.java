package oopHomeWork.dataAccess;

import java.util.ArrayList;
import java.util.List;

import oopHomeWork.entities.Category;


public class JdbcCategoryDao implements CategoryDao {

	private List<Category> categories = new ArrayList<>();
	@Override
	public void add(Category category) {
		categories.add(category);
		System.out.println("JDBC Ile veritabanina eklendi");
		
	}
	@Override
	public List<Category> getAllCategories() {
		return categories;
	}

}
