package test;

import java.util.ArrayList;
import java.util.List;

public class ListDifferentTypes {
    
    public static void main(String[] args) {
        
        List lista = new ArrayList();
        lista.add("olá mundo"); // string
        lista.add(2); // int
        lista.add(5.5f); // float
        
        for (Object e : lista) {
            System.out.println(e);            
            if (e instanceof Integer) {
                System.out.println("==> Este foi um inteiro!");
            }
        }
    }
}

/*

olá mundo
2
==> Este foi um inteiro!
5.5

*/
