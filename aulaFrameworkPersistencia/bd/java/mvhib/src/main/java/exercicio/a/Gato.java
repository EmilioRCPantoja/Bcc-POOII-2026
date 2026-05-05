/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.a;

/**
 *
 * @author emi
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Gato extends Animal {
    
    Date data_nascimento;
    String alergias_conhecidas;
    
    public Gato() { }
    
    public Gato(String nome, String raca) {
        super(nome, raca);
    }
    
    public Gato(String nome, String raca, Date data_nascimento, String alergias) {
        super(nome, raca);
        this.alergias_conhecidas = alergias;
        this.data_nascimento = data_nascimento;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getAlergias_conhecidas() {
        return alergias_conhecidas;
    }

    public void setAlergias_conhecidas(String alergias_conhecidas) {
        this.alergias_conhecidas = alergias_conhecidas;
    }
    
    
    
    
    
}
