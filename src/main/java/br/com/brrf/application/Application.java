package br.com.brrf.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/**
 * Created by djbru on 18/03/2017.
 */

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args){

        SpringApplication.run(Application.class,args);

    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }


}
