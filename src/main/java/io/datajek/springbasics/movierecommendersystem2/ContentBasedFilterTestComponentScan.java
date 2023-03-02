package io.datajek.springbasics.movierecommendersystem2;

import io.datajek.springbasics.movierecommendersystem.Filter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilterTestComponentScan implements Filter {
    @Override
    public String[] getRecommendations(String movie) {
        return new String[0];
    }
}
