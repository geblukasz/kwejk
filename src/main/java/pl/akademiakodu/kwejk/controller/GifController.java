package pl.akademiakodu.kwejk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.akademiakodu.kwejk.dao.GifDao;

@Controller
public class GifController {

    @Autowired
    private GifDao gifDao;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/gif/{title}")
    public String details(@PathVariable String title, ModelMap modelMap){
        modelMap.addAttribute("gif", gifDao.findOne(title));
        return "gif-details";
    }
}
