package br.com.brrf.application.controllers;

import br.com.brrf.application.controllers.entities.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by rafael on 15/04/17.
 */
@RequestMapping(path = "/inscricao")
@Controller
public class CadastroController {

    @RequestMapping(path = "/cadastro", method = RequestMethod.GET)
    public String trazerCadastro(){
        return "Cadastro";
    }

    @RequestMapping(path = "/inscrever", method = RequestMethod.POST)
    public String inscrever(Pessoa pessoa){



        System.out.println("O Nome da pessoa é: " + pessoa.getNome());
        System.out.println("O Sobrenome da pessoa é: " + pessoa.getSobrenome());
        System.out.println("O Login da pessoa é: " + pessoa.getLogin());
        System.out.println("O senha da pessoa é: " + pessoa.getSenha());
        System.out.println("O E-mail da pessoa é: " + pessoa.getEmail());


        return null;
    }


}
