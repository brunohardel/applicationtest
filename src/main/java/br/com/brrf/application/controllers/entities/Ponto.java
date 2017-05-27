package br.com.brrf.application.controllers.entities;

import sun.util.calendar.BaseCalendar;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Hardel on 26/05/2017.
 */

@Entity
@Table (name = "Ponto")
public class Ponto {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private int quantidade;
    @ManyToOne (targetEntity = Pessoa.class)
    private long idPessoa;
    private Date dataPontuacao;

    public void setId(long id){
        this.id = id;
    }

    public long getId(){
        return this.id;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public void setIdPessoa(long idPessoa){
        this.idPessoa = idPessoa;
    }

    public long getIdPessoa(){
        return this.idPessoa;
    }

    public void setDataPontuacao(Date dataPontuacao){
        this.dataPontuacao = dataPontuacao;
    }

    public Date getDataPontuacao(){
        return this.dataPontuacao;
    }
}
