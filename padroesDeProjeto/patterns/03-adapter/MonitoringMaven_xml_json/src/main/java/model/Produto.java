package model;

// https://refactoring.guru/design-patterns/adapter

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

// add maven dependency: "jackson-dataformat-xml"

// https://www.baeldung.com/jaxb

@XmlRootElement(name = "book")
@XmlType(propOrder = { "nome", "precoAtual", "estoque" })
public class Produto {
    
    public String nome;
    public float precoAtual;
    public float estoque;

    public Produto(String nome, float precoAtual, float estoque) {
        this.nome = nome;
        this.precoAtual = precoAtual;
        this.estoque = estoque;
    }
            
    public Produto() {}
    
    @Override
    public String toString() {
        return String.format("%s, preço: R$ %.2f, estoque: %.0f", 
                this.nome, this.precoAtual, this.estoque);
    }
}
