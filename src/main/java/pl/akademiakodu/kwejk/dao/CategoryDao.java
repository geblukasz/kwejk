package pl.akademiakodu.kwejk.dao;

import pl.akademiakodu.kwejk.model.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> showCategories();
    Category searchCategory(String q);
    Category searchCategoryById(int id);

}
