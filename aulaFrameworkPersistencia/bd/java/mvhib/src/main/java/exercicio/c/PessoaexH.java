package exercicio.c;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emi
 */
@Entity
@Table(name = "poo2_emilio_pessoaexh")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class PessoaexH{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "poo2_emilio_pessoaexh_seq")
    @SequenceGenerator(name = "poo2_emilio_pessoaexh_seq", initialValue = 1)
    private long id;
    
    private String nome;
    private String email;

    public PessoaexH() {}
    
    public PessoaexH(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoaex{" + "id=" + id + ", nome=" + nome + ", email=" + email + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }
    
    
    
}
