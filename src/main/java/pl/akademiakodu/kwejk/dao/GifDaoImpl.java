package pl.akademiakodu.kwejk.dao;

import org.springframework.stereotype.Component;
import pl.akademiakodu.kwejk.model.Gif;

import java.util.ArrayList;
import java.util.List;

@Component
public class GifDaoImpl implements GifDao {

    private static List<String> names = new ArrayList<>();

    static {
        names.add("android-explosion");
        names.add("ben-and-mike");
        names.add("book-dominos");
        names.add("compiler-bot");
        names.add("cowboy-coder");
        names.add("infinite-andrew");
    }


    Gif gif = new Gif();
    @Override
    public List<Gif> findAll() {
        List<Gif> gifs = new ArrayList<>();
        int i=1;
        for (String name: names){
            gifs.add(new Gif(name,"username"+i++));
        }
        return gifs;
    }

    @Override
    public Gif findOne(String title){
        return null;
        //.stream().filter((p)->p.getSurname().equals(surname)).collect(Collectors.toList());
    }

}
