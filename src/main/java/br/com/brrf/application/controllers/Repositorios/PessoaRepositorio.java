package br.com.brrf.application.controllers.Repositorios;

import br.com.brrf.application.controllers.entities.Pessoa;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Hardel on 27/05/2017.
 */
public interface PessoaRepositorio extends CrudRepository<Pessoa, Long>{
    public Pessoa findByLogin(String Login);
}
