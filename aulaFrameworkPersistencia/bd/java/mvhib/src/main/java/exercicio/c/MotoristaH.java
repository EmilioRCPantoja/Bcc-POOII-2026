/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.c;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author emi
 */
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class MotoristaH extends PessoaexH{

    @Override
    public String toString() {
        return "MotoristaH{" + "cnh=" + cnh + '}';
    }

    private String cnh;
    
    public MotoristaH(){}

    public MotoristaH(String cnh) {
        this.cnh = cnh;
    }

    public MotoristaH(String cnh, String nome, String email) {
        super(nome, email);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }


    
}
