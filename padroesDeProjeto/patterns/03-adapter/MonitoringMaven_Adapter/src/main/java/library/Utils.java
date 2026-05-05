package library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utils {
    
    public static String readTextFile(String filename) {
        
        String content = "";
        // https://stackoverflow.com/questions/4716503/reading-a-plain-text-file-in-java
        try {
            content = new String(Files.readAllBytes(Paths.get(filename)));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return content;
    }
}
