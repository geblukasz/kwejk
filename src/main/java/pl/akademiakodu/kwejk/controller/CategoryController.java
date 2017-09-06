package pl.akademiakodu.kwejk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.akademiakodu.kwejk.dao.CategoryDao;
import pl.akademiakodu.kwejk.model.Category;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryDao categoryDao;

    @GetMapping("/categories")
    public String showCategories(ModelMap modelMap){
        modelMap.addAttribute("categories", categoryDao.showCategories());
        return "categories";
    }

    @GetMapping("/searchCategory")
    public String searchCategories(@RequestParam String q, ModelMap modelMap){
        if ((categoryDao.searchCategory(q)==null)){
            modelMap.addAttribute("comment", "Nie ma takiej kategorii");
        }
        else{
            List<Category> categories = new ArrayList<>();
            categories.add(categoryDao.searchCategory(q));
            modelMap.addAttribute("categories",categories);
        }
        return "categories";
    }

}
