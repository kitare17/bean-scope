package com.beanscope.beanscope.entity;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {
    private static int instance = 0;
    private int id;
    private String name;
    private String genre;
    private String producer;

    public Movie() {
        instance++;
        System.out.println("Movie create");
    }

    public Movie(int id, String name, String genre, String producer) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.producer = producer;
    }

    public static int getInstance() {
        return instance;
    }

    public static void setInstance(int instance) {
        Movie.instance = instance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
