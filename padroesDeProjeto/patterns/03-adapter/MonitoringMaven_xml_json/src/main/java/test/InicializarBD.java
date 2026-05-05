package test;

// alterando a linha abaixo, troca-seu o DAO
// como garantir que os dois DAOs implementem
// as mesmas operações?

//import dao.json.DAO_Produto;
import dao.xml.DAO_Produto;
import java.util.ArrayList;
import model.Produto;

public class InicializarBD {
    
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
