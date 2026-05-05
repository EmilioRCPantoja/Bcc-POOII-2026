package dao.xml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import model.Produto;

public class DAO_Produto {

    public ArrayList<Produto> retornarProdutos() {

        ProdutosXML prods = new ProdutosXML();
        
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(ProdutosXML.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            prods = (ProdutosXML) jaxbUnmarshaller.unmarshal(new File("bdxml/produtos.xml"));

        } catch (JAXBException ex) {
            System.out.println("Erro ar ler: " + ex.getMessage());
        }
        return prods.produtos;
    }

    public void IniciarBDComProdutos(ArrayList<Produto> prods) {
        File file = new File("bdxml/produtos.xml");
        JAXBContext jaxbContext;

        ProdutosXML prodsX = new ProdutosXML();
        prodsX.produtos = new ArrayList<>(prods);

        try {
            jaxbContext = JAXBContext.newInstance(ProdutosXML.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(prodsX, file);
        } catch (JAXBException ex) {
            System.out.println("Erro ar gravar: " + ex.getMessage());
        }
    }
}
