package oopHomeWork.dataAccess;

import java.util.List;

import oopHomeWork.entities.Category;

public interface CategoryDao {
	void add(Category category);
	public List<Category> getAllCategories();

}
