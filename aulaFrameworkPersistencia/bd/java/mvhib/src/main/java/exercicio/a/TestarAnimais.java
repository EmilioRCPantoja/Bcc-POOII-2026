package exercicio.a;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emi
 */

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.Date;

public class TestarAnimais {
    public static void main(String[] args) {
        
        Cachorro c = new Cachorro("au", "caramelo", "raiva");
        Date data = Date.valueOf("2026-04-13");
        Gato g = new Gato("miau", "persa", data, "poeira");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
        EntityManager em = emf.createEntityManager();
        
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        em.persist(c);
        em.persist(g);
        tx.commit();
        
        Animal a1 = em.createQuery("from Animal", Animal.class).getResultList().get(0);
        
        Gato g1 = em.createQuery("from Gato", Gato.class)
                .getSingleResult();
        System.out.println(g1);
        
        Cachorro c1 = em.createQuery("from Cachorro", Cachorro.class)
                .getSingleResult();
        System.out.println(c1);
        
        em.close();
    }
    
}
