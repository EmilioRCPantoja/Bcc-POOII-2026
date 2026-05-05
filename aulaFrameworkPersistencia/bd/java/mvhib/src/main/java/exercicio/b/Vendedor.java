/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.b;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.sql.Date;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

/**
 *
 * @author emi
 */
@Entity
public class Vendedor{
    @Id
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "pessoa_id", unique = true)
    private Pessoaex info;
    
    private Date data_nascimento;
    private float comissao;
    
    public Vendedor(String nome, String email) {
        info = new Pessoaex(nome, email);
    }
    
    public Vendedor(String nome, String email, Date data_nascimento, float comissao) {
        info = new Pessoaex(nome, email);
        this.data_nascimento = data_nascimento;
        this.comissao = comissao;
        
    }
    
    public Vendedor(Pessoaex p, Date data_nascimento, float comissao ){
        info = p;
        this.data_nascimento = data_nascimento;
        this.comissao = comissao;
        
    } 

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "id=" + id + ", info Pessoa=" + info.toString() + ", data_nascimento=" + data_nascimento + ", comissao=" + comissao + '}';
    }
    
    
    
}
