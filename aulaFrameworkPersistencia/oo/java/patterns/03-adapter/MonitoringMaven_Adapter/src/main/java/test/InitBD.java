package test;

import dao.xml.DAO_Produto;
import java.util.ArrayList;
import model.Produto;

public class InitBD {
    
    public static void main(String[] args) {
        
        Produto arroz = new Produto("Arroz Tio João 500gr", 5f, 50f);
        Produto feijao = new Produto("Feijão Caldão 500gr", 7f, 40f);
        DAO_Produto dp = new DAO_Produto();
        ArrayList<Produto> prods = new ArrayList();
        prods.add(arroz);
        prods.add(feijao);
        dp.IniciarBDComProdutos(prods);
        System.out.println("BD inicializado");
    }
    
}
