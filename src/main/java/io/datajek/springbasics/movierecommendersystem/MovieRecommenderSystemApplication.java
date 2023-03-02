package io.datajek.springbasics.movierecommendersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan(basePackages = {"io.datajek.springbasics.movierecommendersystem",
							   "io.datajek.springbasics.movierecommendersystem2"})
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class,args);



		/*System.out.println("Content based filter found: " + appContext.containsBean("contentBasedFilter"));
		System.out.println("Content based filter  test component scan found: " + appContext.containsBean("contentBasedFilterTestComponentScan"));*/


		/*//Retrieve Singleton bean from Application Context
		ContentBasedFilter filter= appContext.getBean(ContentBasedFilter.class);
		System.out.println("\nContent Based filter with Singleton scope");
		System.out.println(filter);

		//Retrieve prototype bean from the singleton bean thrice
		Movie movie1 = filter.getMovie();
		Movie movie2 = filter.getMovie();
		Movie movie3 = filter.getMovie();

		System.out.println("\nMovie bean with prototype scope");
		System.out.println(movie1);
		System.out.println(movie2);
		System.out.println(movie3);

		System.out.println("ContentBasedfilter instances created:" + ContentBasedFilter.getInstances());
		System.out.println("Movie instances created:" + Movie.getInstances());*/


		/*RecommenderImplementation recommenderImplementation = appContext.getBean(RecommenderImplementation.class);
		ContentBasedFilter cbf1 = appContext.getBean(ContentBasedFilter.class);
		ContentBasedFilter cbf2 = appContext.getBean(ContentBasedFilter.class);
		ContentBasedFilter cbf3 = appContext.getBean(ContentBasedFilter.class);
		System.out.println("Testing Bean scope");
		System.out.println(cbf1);
		System.out.println(cbf2);
		System.out.println(cbf3);*/

		/*RecommenderImplementation recommenderImplementation = appContext.getBean(RecommenderImplementation.class);
		CollaborativeFilter cbf1 = appContext.getBean(CollaborativeFilter.class);
		CollaborativeFilter cbf2 = appContext.getBean(CollaborativeFilter.class);
		CollaborativeFilter cbf3 = appContext.getBean(CollaborativeFilter.class);
		System.out.println(cbf1);
		System.out.println(cbf2);
		System.out.println(cbf3);*/


		/*RecommenderImplementation2 recommenderImplementation2 = appContext.getBean(RecommenderImplementation2.class);
		String[] result = recommenderImplementation.recommendMovies("Finding Dory");

		String[] result2 = recommenderImplementation2.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(result2));*/
	}

}
