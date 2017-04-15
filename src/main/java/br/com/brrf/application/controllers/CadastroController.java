package br.com.brrf.application;

import org.springframework.stereotype.Controller;
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
    public String inscrever(@RequestParam(name = "Login") String login){
        System.out.println("O seu login é: " + login);
        return null;
    }


}
