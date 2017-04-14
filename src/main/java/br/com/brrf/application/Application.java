package br.com.brrf.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by djbru on 18/03/2017.
 */

@SpringBootApplication
@Controller

public class Application {
    public static void main(String[] args){

        SpringApplication.run(Application.class,args);

    }

    @RequestMapping (path = "/olaMundo")
    public String olaMundo(){
        return "Index";
    }

}
