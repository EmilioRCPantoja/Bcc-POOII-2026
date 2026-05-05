package dao.xml;

import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import model.Produto;

@XmlRootElement
public class ProdutosXML {
    
    public ArrayList<Produto> produtos = new ArrayList<>();

    public ProdutosXML() {}
    
}
