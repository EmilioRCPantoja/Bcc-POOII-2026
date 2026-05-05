package adapter;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class AdapterXML_JSON {

    public static String asJson(String xml_string) {
        int PRETTY_PRINT_INDENT_FACTOR = 4;
        
        try {
            
            JSONObject xmlJSONObj = XML.toJSONObject(xml_string);
            String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
            return jsonPrettyPrintString;
        } catch (JSONException je) {
            System.out.println(je.toString());
        }  
        return "";
    }    
    
}
