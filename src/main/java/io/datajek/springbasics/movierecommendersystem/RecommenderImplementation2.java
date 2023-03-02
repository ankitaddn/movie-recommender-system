package io.datajek.springbasics.movierecommendersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {

    private Filter filter;

    public RecommenderImplementation2(Filter filter) {
        this.filter = filter;
    }

    /*@Autowired
    public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {
        this.filter = filter;
    }*/


    public String[] recommendMovies(String movie){
        System.out.println("Name of the filter in use: " + filter);
        String results[] = filter.getRecommendations(movie);
        return results;
    }

    @Autowired
    @Qualifier("contentBasedFilter")
    public void setFilter(Filter filter) {
        this.filter = filter;
        //System.out.println("Setter Method Invoked");
    }
}
