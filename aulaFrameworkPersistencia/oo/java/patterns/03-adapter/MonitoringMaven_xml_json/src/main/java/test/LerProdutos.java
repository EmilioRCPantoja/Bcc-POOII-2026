package test;

import dao.xml.DAO_Produto;
//import dao.json.DAO_Produto;
import java.util.ArrayList;
import model.Produto;

public class LerProdutos {
    
    public static void main(String[] args) {
        
        DAO_Produto dp = new DAO_Produto();
        ArrayList<Produto> prods = dp.retornarProdutos();
        System.out.println("PRODUTOS");
        for (Produto p: prods) {
            System.out.println(p);
        }
    }
    
}
