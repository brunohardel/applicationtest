package br.com.brrf.application.controllers;

import br.com.brrf.application.controllers.Repositorios.PessoaRepositorio;
import br.com.brrf.application.controllers.entities.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by rafael on 15/04/17.
 */
@Controller
@RequestMapping(path = "/inscricao")
public class LoginController {

    @Autowired
    PessoaRepositorio repositorio;

    @RequestMapping(path = "/login")
    public String trazerLogin() {
        return "login";
    }

    @RequestMapping(path = "/logar", method = RequestMethod.POST)
    public String logar(Pessoa pessoa) {
        Pessoa pessoaAutenticada = repositorio.findByLogin(pessoa.getLogin());

        if (pessoaAutenticada != null && pessoaAutenticada.getLogin() == pessoa.getLogin() && pessoaAutenticada.getSenha() == pessoa.getSenha()){
            return "retornoCadastro";
        }
        return null;
    }


}
