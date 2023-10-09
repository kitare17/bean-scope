package com.beanscope.beanscope.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContentBaseFilter implements Filter {
    @Autowired
    private Movie movie;

    private static int instance=0;
    public ContentBaseFilter() {
        instance++;
        System.out.println("Filter create");
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public static int getInstance() {
        return instance;
    }

    public static void setInstance(int instance) {
        ContentBaseFilter.instance = instance;
    }

//    @Override
//    public String toString() {
//        return "ContentBaseFilter{" +
//                "movie=" + movie +
//                '}';
//    }
}
