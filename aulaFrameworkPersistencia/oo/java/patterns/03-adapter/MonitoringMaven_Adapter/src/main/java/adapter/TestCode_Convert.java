package adapter;

// https://stackoverflow.com/questions/1823264/quickest-way-to-convert-xml-to-json-in-java

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class TestCode_Convert {
    
    public static void main(String[] args) {
        int PRETTY_PRINT_INDENT_FACTOR = 4;
        String TEST_XML_STRING =
        "<?xml version=\"1.0\" ?><test attrib=\"moretest\">Turn this to JSON</test>";

        try {
            JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);
            String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
            System.out.println(jsonPrettyPrintString);
        } catch (JSONException je) {
            System.out.println(je.toString());
        }   
    }
}
