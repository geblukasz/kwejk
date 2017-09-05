package pl.akademiakodu.kwejk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.kwejk.dao.CategoryDao;

@Controller
public class CategoryController {

    @Autowired
    CategoryDao categoryDao;

    @GetMapping("/categories")
    public String showCategories(ModelMap modelMap){
        modelMap.addAttribute("categories", categoryDao.showCategories());
        return "categories";
    }
}
