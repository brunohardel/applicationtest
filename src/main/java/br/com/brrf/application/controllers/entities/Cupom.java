package br.com.brrf.application.controllers.entities;

import br.com.brrf.application.controllers.core.ColumnsDefinitions;

import javax.persistence.*;
import java.text.DecimalFormat;
import java.util.Date;

/**
 * Created by Hardel on 26/05/2017.
 */

@Entity
@Table (name = "Cupom")
public class Cupom {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column (columnDefinition = ColumnsDefinitions.MONEY_VALUES)
    private DecimalFormat valor;
    private Date dataLancamento;
    @ManyToOne (targetEntity = Pessoa.class)
    private long idPessoa;

    public void setId(long id){
        this.id = id;
    }

    public long getId(){
        return this.id;
    }

    public void setValor(DecimalFormat valor){ this.valor = valor; }

    public DecimalFormat getValor(){
        return this.valor;
    }

    public void setDataLancamento(Date dataLancamento){
        this.dataLancamento = dataLancamento;
    }

    public Date getDataLancamento(){
        return this.dataLancamento;
    }

    public long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(long idPessoa) {
        this.idPessoa = idPessoa;
    }
}
