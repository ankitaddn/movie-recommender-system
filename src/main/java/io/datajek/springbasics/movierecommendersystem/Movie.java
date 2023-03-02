package io.datajek.springbasics.movierecommendersystem;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Movie {
    private static int instances = 0;

    private int id;
    private String name;
    private String genre;
    private String producer;


    public Movie() {
        instances++;
        System.out.println("Movie Constructor Called");
    }

    public static int getInstances(){
        return Movie.instances;
    }
}
