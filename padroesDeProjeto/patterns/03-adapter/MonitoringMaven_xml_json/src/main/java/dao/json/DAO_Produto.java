package dao.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import model.Produto;

public class DAO_Produto {

    public ArrayList<Produto> retornarProdutos() {
        ArrayList<Produto> prods = new ArrayList();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            prods = objectMapper.readValue(new File("bdjson/produtos.json"), new TypeReference<ArrayList<Produto>>(){});
        } catch (IOException ex) {
            System.out.println("ERRO ao ler: " + ex.getMessage());
        }
        return prods;
    }

    public void IniciarBDComProdutos(ArrayList<Produto> prods) {

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("bdjson/produtos.json"), prods);
        } catch (IOException ex) {
            System.out.println("ERRO ao gravar: " + ex.getMessage());
        }

    }
}
