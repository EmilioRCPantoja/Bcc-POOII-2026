package test;

import java.util.ArrayList;
import java.util.List;
import model.Carro;
import model.Pessoa;

public class ListsDifferentObjects {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.nome = "João da Silva";
        p1.email = "josilva@gmail.com";
        
        Carro fox = new Carro();
        fox.placa = "FFFF 002";
        fox.marca = "Volkswagen";
        fox.modelo = "Fox";
        
        List lista = new ArrayList();
        // adicionando pessoa e carro na lista
        lista.add(p1);
        lista.add(fox);
        
        for (Object e : lista) {
            if (e instanceof Pessoa) {
                Pessoa p = (Pessoa) e;
                System.out.println("Pessoa: " + p.nome);
            } else if (e instanceof Carro) {
                Carro c = (Carro) e; //typecast
                System.out.println("Carro: " + c.modelo);
            }
        }
    }
    
}

/*

Pessoa: João da Silva
Carro: Fox

*/