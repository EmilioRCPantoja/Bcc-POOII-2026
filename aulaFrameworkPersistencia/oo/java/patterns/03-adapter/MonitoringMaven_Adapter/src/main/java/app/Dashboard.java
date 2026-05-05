package app;

import adapter.AdapterXML_JSON;
import library.Analytics;
import library.Utils;

public class Dashboard {

    public static void main(String[] args) {

        // read data in XML
        String xml_content = Utils.readTextFile("bdxml/produtos.xml");

        // convert data to json, via Adapter
        String json_content = AdapterXML_JSON.asJson(xml_content);
        
        // call the analitics
        Analytics a = new Analytics();
        a.analyses(json_content);
        
        //a.analyses("olá mundo");
    }
}
