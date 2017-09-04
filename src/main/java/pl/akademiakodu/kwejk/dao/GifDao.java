package pl.akademiakodu.kwejk.dao;

import pl.akademiakodu.kwejk.model.Gif;

import java.util.List;

public interface GifDao {
    List<Gif> findAll();
}
