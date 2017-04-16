package br.com.brrf.application.controllers;

import br.com.brrf.application.controllers.entities.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by rafael on 15/04/17.
 */
@Controller
@RequestMapping(path = "/inscricao")
public class LoginController {

    @RequestMapping(path = "/login")
    public String trazerLogin() {
        return "Login";
    }

    @RequestMapping(path = "/logar", method = RequestMethod.POST)
    public void logar(Pessoa pessoa) {

        System.out.println("O Login é: " + pessoa.getLogin());
        System.out.println("A Senha é: " + pessoa.getSenha());
    }


}
