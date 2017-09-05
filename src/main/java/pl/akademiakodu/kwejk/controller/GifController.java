package pl.akademiakodu.kwejk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.kwejk.dao.GifDao;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GifController {

    @Autowired
    private GifDao gifDao;

    @GetMapping("/")
    public String showAll(ModelMap modelMap) {
        modelMap.addAttribute("gifs", gifDao.findAll());
        return "home";
    }

    @GetMapping("/gif/{name}")
    public String details(@PathVariable String name, ModelMap modelMap) {
        modelMap.addAttribute("gif", gifDao.findOne(name));
        return "gif-details";
    }

    @GetMapping("/favorites")
    public String home(ModelMap modelMap) {
        modelMap.addAttribute("gifs",gifDao.getFavorites());
        System.out.println("ilość"+gifDao.getFavorites().size());
        return "favorites";
    }

}
