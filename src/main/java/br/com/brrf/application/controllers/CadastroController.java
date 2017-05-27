package br.com.brrf.application.controllers;

import br.com.brrf.application.controllers.entities.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by rafael on 15/04/17.
 */
@RequestMapping(path = "/inscricao")
@Controller
public class CadastroController {

    @RequestMapping(path = "/cadastro", method = RequestMethod.GET)
    public String trazerCadastro(){
        return "registro";
    }

    @RequestMapping(path = "/inscrever", method = RequestMethod.POST)
    public String inscrever(Pessoa pessoa, Model model){

        System.out.println("O Nome da pessoa é: " + pessoa.getNome());
        System.out.println("O Sobrenome da pessoa é: " + pessoa.getSobrenome());
        System.out.println("O Login da pessoa é: " + pessoa.getLogin());
        System.out.println("O senha da pessoa é: " + pessoa.getSenha());
        System.out.println("O E-mail da pessoa é: " + pessoa.getEmail());

        model.addAttribute("Humano", pessoa);
        return "retornoCadastro";
    }

    @RequestMapping(path = "/retornoPessoa", method = RequestMethod.GET)
    public String trazerPessoa(Model model){
        Pessoa p1 = new Pessoa();
            p1.setNome("Bruno");
            p1.setSenha("123456");
            p1.setLogin("Hardel");
            p1.setEmail("djbrunohardel@hotmail.com");
            p1.setSobrenome("Ardel");
        model.addAttribute("Humano", p1);
        return "retornoCadastro";
    }
}
