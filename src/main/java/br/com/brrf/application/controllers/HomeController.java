package br.com.brrf.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rafael on 10/06/17.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

}
