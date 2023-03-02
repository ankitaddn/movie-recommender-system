package io.datajek.springbasics.movierecommendersystem;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component("collaborativeFilter")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CollaborativeFilter implements Filter{
    public CollaborativeFilter() {
        System.out.println("Collaborative-Base constructor called");
    }

    public String[] getRecommendations(String movie){
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
