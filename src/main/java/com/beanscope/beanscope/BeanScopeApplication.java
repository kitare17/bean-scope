package com.beanscope.beanscope;

import com.beanscope.beanscope.entity.ContentBaseFilter;

import com.beanscope.beanscope.entity.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeanScopeApplication {

    public static void main(String[] args) {

       ApplicationContext context= (ApplicationContext) SpringApplication.run(BeanScopeApplication.class, args);

        ContentBaseFilter filter=context.getBean(ContentBaseFilter.class);
        System.out.println("Filter nè");
        System.out.println(filter);

        Movie movie1=filter.getMovie();
        Movie movie2=filter.getMovie();
        Movie movie3=filter.getMovie();
        System.out.println("Movie   1"+movie1);
        System.out.println("Movie   2"+movie2);
        System.out.println("Movie   2"+movie2);
        System.out.println("Total movie "+Movie.getInstance());
    }

}
