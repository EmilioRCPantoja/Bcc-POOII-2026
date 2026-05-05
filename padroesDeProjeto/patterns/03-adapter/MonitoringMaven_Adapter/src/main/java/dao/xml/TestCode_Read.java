package dao.xml;

import dao.xml.ProdutosXML;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;

import model.Produto;

// https://stackoverflow.com/questions/19396834/dom-xml-parser-example
public class TestCode_Read {

    public static void main(String[] args) {

        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(ProdutosXML.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ProdutosXML prods = (ProdutosXML) jaxbUnmarshaller.unmarshal(new File("bdxml/produtos.xml"));

            for (Produto p : prods.produtos) {
                System.out.println(p);
            }
        } catch (JAXBException ex) {
            System.out.println("Erro ar ler: " + ex.getMessage());
        }

    }

}
