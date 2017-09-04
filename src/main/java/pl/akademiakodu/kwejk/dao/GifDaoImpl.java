package pl.akademiakodu.kwejk.dao;

import pl.akademiakodu.kwejk.model.Gif;

import java.util.List;
import java.util.stream.Collectors;

public class GifDaoImpl implements GifDao {

    Gif gif = new Gif();
    @Override
    public List<Gif> findAll() {
        return null;
    }

    @Override
    public Gif findOne(String title){
        return null;
        //.stream().filter((p)->p.getSurname().equals(surname)).collect(Collectors.toList());
    }
}
