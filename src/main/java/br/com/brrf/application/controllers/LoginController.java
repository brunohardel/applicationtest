package br.com.brrf.application;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rafael on 15/04/17.
 */
@RequestMapping(path = "/inscricao")
public class LoginController {

    @RequestMapping("/login")
    public String trazerLogin() {
        return "Login";
    }



}
