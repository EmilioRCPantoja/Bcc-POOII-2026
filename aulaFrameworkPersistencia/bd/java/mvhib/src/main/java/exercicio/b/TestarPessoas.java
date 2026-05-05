/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.b;

/**
 *
 * @author emi
 */

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.Date;

public class TestarPessoas {
    public static void main(String[] args) {
        
        Date data = Date.valueOf("2026-04-13");
        
        Pessoaex p = new Pessoaex("joao", "joaoemail");
        
        Vendedor v = new Vendedor(p, data, 0.5f);
        
        Motorista m = new Motorista(p, "0123456");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
        EntityManager em = emf.createEntityManager();
        
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        em.persist(v);
        em.persist(m);
        tx.commit();
        
       Vendedor v1 = em.createQuery("from Vendedor", Vendedor.class)
                .getSingleResult();
        System.out.println(v1.toString());
        
        Motorista m1 = em.createQuery("from Motorista", Motorista.class)
                .getSingleResult();
        System.out.println(m1.toString());
        
        Pessoaex p1 = em.createQuery("from Pessoaex", Pessoaex.class)
                .getSingleResult();
        System.out.println(p1.toString());
        
        
        em.close();
    }

}
