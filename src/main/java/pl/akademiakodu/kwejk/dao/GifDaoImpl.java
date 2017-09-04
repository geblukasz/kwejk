package pl.akademiakodu.kwejk.dao;

import org.springframework.stereotype.Component;
import pl.akademiakodu.kwejk.model.Gif;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class GifDaoImpl implements GifDao {

    public GifDaoImpl(){}

    private static List<String> titles = new ArrayList<>();

    public static List<String> getTitles() {
        return titles;
    }

    public static void setTitles(List<String> titles) {
        GifDaoImpl.titles = titles;
    }

    static{
        titles.add("android-explosion");
        titles.add("ben-and-mike");
        titles.add("book-dominos");
        titles.add("compiler-bot");
        titles.add("cowboy-coder");
        titles.add("infinite-andrew");
    }
    @Override
    public List<Gif> findAll() {
        List<Gif> gifs = new ArrayList<>();
        int i = 1;
        for(String title : titles){
            gifs.add(new Gif(title, "username"+i++));
        }
        return gifs;
    }

    @Override
    public Gif findOne(String title){
        return null;
    }
}
