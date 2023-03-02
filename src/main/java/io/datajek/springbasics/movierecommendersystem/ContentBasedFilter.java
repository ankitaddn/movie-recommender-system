package io.datajek.springbasics.movierecommendersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ContentBasedFilter implements Filter{

    private static int instances=0;

    @Autowired
    Movie movie;

    public ContentBasedFilter() {
        instances++;
        System.out.println("Content-Based Constructor Called");
    }

    @Lookup
    public Movie getMovie(){
        return movie;
    }

    public static int getInstances(){
        return ContentBasedFilter.instances;
    }

    public String[] getRecommendations(String movie){
        return new String[] {"Happy Feet","Ice Age","Shark Tale"};
    }
}
