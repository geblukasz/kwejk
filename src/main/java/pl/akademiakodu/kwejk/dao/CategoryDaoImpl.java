package pl.akademiakodu.kwejk.dao;

import org.springframework.stereotype.Component;
import pl.akademiakodu.kwejk.model.Category;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryDaoImpl implements CategoryDao{

    public CategoryDaoImpl() {}

    public static List<Category> getCategories() {
        return categories;
    }


    public static void setCategories(List<Category> categories) {
        CategoryDaoImpl.categories = categories;
    }

    private static List<Category> categories = new ArrayList<>();

    static {
        categories.add(new Category("Smieszne","1"));
        categories.add(new Category("TOP 10","2"));
        categories.add(new Category("Motywujące","3"));
        categories.add(new Category("Dziwne","4"));
        categories.add(new Category("Samochody","5"));
        categories.add(new Category("Motocykle","6"));
    }

    @Override
    public List<Category> showCategories() {
        return categories;
    }
}
