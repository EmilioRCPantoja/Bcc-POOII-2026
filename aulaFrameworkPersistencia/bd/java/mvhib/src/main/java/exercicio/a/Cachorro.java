/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.a;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author emi
 */
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Cachorro extends Animal{
    
    String vacinas_conhecidas;
    
    public Cachorro(){}
    
    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }
    
    public Cachorro(String nome, String raca, String vacinas_conhecidas) {
        super(nome, raca);
        this.vacinas_conhecidas = vacinas_conhecidas;
    }

    public String getVacinas_conhecidas() {
        return vacinas_conhecidas;
    }

    public void setVacinas_conhecidas(String vacinas_conhecidas) {
        this.vacinas_conhecidas = vacinas_conhecidas;
    }
    
}
