package library;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Analytics {

    // https://stackoverflow.com/questions/10174898/how-to-check-whether-a-given-string-is-valid-json-in-java
    public boolean isJSONValid(String test) {
    try {
        JSONObject jsonObject = new JSONObject(test);
    } catch (JSONException ex) {
        // edited, to include @Arthur's comment
        // e.g. in case JSONArray is valid as well...
        try {
            JSONArray jsonArray = new JSONArray(test);
        } catch (JSONException ex1) {
            return false;
        }
    }
    return true;
}

    // external library with receives data in json
    public void analyses(String data) {

        if (isJSONValid(data)){
            System.out.println(data);
        } else {
            System.out.println("The data is not is JSON format");
        }

    }
    
    // test of the class
    public static void main(String[] args) {

        // https://www.baeldung.com/java-org-json
        
        // creates an analytis 
        Analytics a = new Analytics();

        // prepares some data for json export
        
        JSONArray ja = new JSONArray();

        JSONObject jo = new JSONObject();
        jo.put("nome", "Arroz Tio João 500gr");
        jo.put("precoAtual", 5.0);
        jo.put("estoque", 50.0);
        ja.put(jo);

        jo = new JSONObject();
        jo.put("nome", "Feijão Caldão 500gr");
        jo.put("precoAtual", 7.0);
        jo.put("estoque", 40.0);
        ja.put(jo);

        // run the analyser
        a.analyses(ja.toString());
        
        // run the analyser with wrong data
        a.analyses("hello :-)");
    }
}
