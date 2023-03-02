package io.datajek.springbasics.movierecommendersystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class RecommenderImplementation {

    private Filter filter;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /*public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }*/

    @Autowired
    public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {
        this.filter = filter;
    }

    @Autowired
    public void setFilter(Filter filter) {
        logger.info("In RecommenderImplementation setter method..dependency injection");
        this.filter = filter;
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("In RecommenderImplementation postConstruct method");
    }

    public String[] recommendMovies(String movie){
        System.out.println("Name of the filter in use: " + filter);
        String results[] = filter.getRecommendations(movie);
        return results;
    }
}
