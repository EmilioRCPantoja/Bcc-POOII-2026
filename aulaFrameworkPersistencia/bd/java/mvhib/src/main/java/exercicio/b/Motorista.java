/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.b;

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
public class Motorista{
    @Id
    private Long id;


    @OneToOne
    @MapsId
    @JoinColumn(name = "pessoa_id", unique = true)
    private Pessoaex info;
    private String cnh;
    
    public Motorista(String nome, String email) {
        this.info = new Pessoaex(nome, email);
    }
    
    public Motorista(Pessoaex info, String cnh) {
        this.info = info;
        this.cnh = cnh;
    }
    
    public Motorista(String nome, String email,String cnh) {
        this.info = new Pessoaex(nome, email);
        this.cnh = cnh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoaex getInfo() {
        return info;
    }

    public void setInfo(Pessoaex info) {
        this.info = info;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return "Motorista{" + "id=" + id + ", info Pessoa=" + info.toString() + ", cnh=" + cnh + '}';
    }
    
    
}
