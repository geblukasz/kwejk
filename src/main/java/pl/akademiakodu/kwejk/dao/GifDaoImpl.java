package pl.akademiakodu.kwejk.dao;

import org.springframework.stereotype.Component;
import pl.akademiakodu.kwejk.model.Gif;

import java.util.ArrayList;
import java.util.List;

@Component
public class GifDaoImpl implements GifDao {

    public GifDaoImpl() {
    }

    private static List<String> names = new ArrayList<>();

    public static List<String> getNames() {
        return names;
    }

    public static void setNames(List<String> names) {
        GifDaoImpl.names = names;
    }

    static {
        names.add("android-explosion");
        names.add("ben-and-mike");
        names.add("book-dominos");
        names.add("compiler-bot");
        names.add("cowboy-coder");
        names.add("infinite-andrew");
    }

    @Override
    public List<Gif> findAll() {
        List<Gif> gif = new ArrayList<>();
        int i = 1;
        for (String name : names) {
            gif.add(new Gif(name, "username" + i++));
        }
        return gif;
    }

    @Override
    public Gif findOne(String name) {
        for (Gif gif : findAll()) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

}
