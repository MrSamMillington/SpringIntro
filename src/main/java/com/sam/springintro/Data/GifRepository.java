package com.sam.springintro.Data;

import com.sam.springintro.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
        new Gif("android-explosion", LocalDate.of(2015,2,13), "Chris Ramacciotti", false, 3),
        new Gif("ben-and-mike", LocalDate.of(2015,10,30), "Ben Jakuben", true, 2),
        new Gif("book-dominos", LocalDate.of(2015,9,15), "Craig Dennis", false, 1),
        new Gif("compiler-bot", LocalDate.of(2015,2,13), "Ada Lovelace", true, 1),
        new Gif("cowboy-coder", LocalDate.of(2015,2,13), "Grace Hopper", false, 2),
        new Gif("infinite-andrew", LocalDate.of(2015,8,23), "Marissa Mayer", true, 2)
    );

    public Gif findByName(String name){
        for(Gif gif : ALL_GIFS){
            if(gif.getName().equals(name)) return gif;
        }
        return null;
    }

    public List<Gif> getAllGifs(){
        return ALL_GIFS;
    }

    public List<Gif> findByCategoryId(int id){
        List<Gif> gifs = new ArrayList<>();
        for(Gif gif : ALL_GIFS){
            if(gif.getCategoryId() == id){
                gifs.add(gif);
            }
        }
        return gifs;
    }
}
