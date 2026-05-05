/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.xml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import java.io.File;
import model.Produto;

public class TestCode_Save {

    public static void main(String[] args) {

        Produto arroz = new Produto("Arroz Tio João 500gr", 5f, 50f);
        Produto feijao = new Produto("Feijão Caldão 500gr", 7f, 40f);
        
        ProdutosXML prods = new ProdutosXML();
        prods.produtos.add(arroz);
        prods.produtos.add(feijao);

        File file = new File("bdxml/produtos.xml");
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(ProdutosXML.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(prods, file);
        } catch (JAXBException ex) {
            System.out.println("Erro ar gravar: "+ex.getMessage());
        }

    }

}
