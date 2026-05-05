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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "poo2_emilio_animal")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Animal {
 
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "poo2_emilio_animal_seq")
    @SequenceGenerator(name = "poo2_emilio_animal_seq", initialValue = 1)
    private long id;
    
    private String nome;
    private String raca;
    
    protected Animal(){}

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public long getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
   
    @Override
    public String toString() {
        return "Animal{" + ", nome=" + nome + ", raca=" + raca + '}';
    }
    
}
