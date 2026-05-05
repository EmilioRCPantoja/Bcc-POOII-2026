/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.c;

/**
 *
 * @author emi
 */

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.Date;
import java.util.List;

public class TestarPessoasH {
    public static void main(String[] args) {
        
        Date data = Date.valueOf("2026-04-13");
        
        PessoaexH p = new PessoaexH("joao", "joaoemail");
        //Ao fazer isso, por mais que o nome e email permaneçam os mesmos, o sistema vai entender como duas pessoas diferentes
        // e se por acaso joao mudar de nome, terão que ser atualizados dois registros no banco de dados
        // outro ponto é o fato de teremé
        
        VendedorH v = new VendedorH(data, 0.5f, p.getNome(), p.getEmail() );
        
        MotoristaH m = new MotoristaH("0123456", p.getNome(), p.getEmail());
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
        EntityManager em = emf.createEntityManager();
        
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        em.persist(v);
        em.persist(m);
        tx.commit();
        
       VendedorH v1 = em.createQuery("from VendedorH", VendedorH.class)
                .getSingleResult();
        System.out.println(v1.toString());
        
        MotoristaH m1 = em.createQuery("from MotoristaH", MotoristaH.class)
                .getSingleResult();
        System.out.println(m1.toString());
        
        List<PessoaexH> pessoas = em.createQuery("from PessoaexH", PessoaexH.class).getResultList();

        System.out.println("Lista de todas as pessoas:");
        for (PessoaexH pessoa : pessoas) {
            System.out.println(pessoa.toString());
        }
        
        
        em.close();
    }

}
