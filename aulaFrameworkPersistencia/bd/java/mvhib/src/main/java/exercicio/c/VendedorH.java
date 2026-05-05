/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.c;

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
@PrimaryKeyJoinColumn(name = "id")
public class VendedorH extends PessoaexH{
    private Date data_nascimento;
    private float comissao;

    public VendedorH(Date data_nascimento, float comissao) {
        this.data_nascimento = data_nascimento;
        this.comissao = comissao;
    }

    public VendedorH(Date data_nascimento, float comissao, String nome, String email) {
        super(nome, email);
        this.data_nascimento = data_nascimento;
        this.comissao = comissao;
    }
    
      public VendedorH() {}

    @Override
    public String toString() {
        return "VendedorH{" + ", data_nascimento=" + data_nascimento + ", comissao=" + comissao +  '}';
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

   
    
    
    
}
