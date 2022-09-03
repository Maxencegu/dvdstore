package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import com.mycompany.dvdstore.repository.file.FileMovieRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.mycompany.dvdstore.controller","com.mycompany.dvdstore.service"/*,"com.mycompany.dvdstore.repository.memory"*/})
@PropertySource("classpath:application.properties")
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        MovieController movieController = context.getBean(MovieController.class);
        movieController.addUsingConsole();
    }

    @Bean
    MovieRepositoryInterface configurationMovieRepository() {
        return new FileMovieRepository();
    }
}
