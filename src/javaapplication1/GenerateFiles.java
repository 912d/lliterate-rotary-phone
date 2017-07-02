package javaapplication1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author re
 */
public class GenerateFiles {
    
    private final SimpleDateFormat sdf;
    private final String date;

    private String getRandomInt() {
        SecureRandom random = new SecureRandom();
        return Integer.toString(random.nextInt(12345));
    }
    
    private String getRandomInt(int range) {
        SecureRandom random = new SecureRandom();
        return Integer.toString(random.nextInt(range));
    }
    
    public GenerateFiles() {
        this.sdf = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
        this.date = sdf.format(new Date());
        
        String filename = getRandomInt() + getRandomInt() +
                "TestFile_" + date + "_" + "moasd" + getRandomInt();

        try (PrintWriter printWriter = new PrintWriter(filename, "utf-8")) {
            printWriter.println("##askdjaskjdl qij12391i 12093 12ds##");
            printWriter.println("##askdjaskjdl qij12391i 12093 12ds##");
            printWriter.println(getRandomInt()+"."+getRandomInt() +
                    " Pluto Program Ver " + getRandomInt(99) + "." 
                    + getRandomInt(99) + ".5" + getRandomInt(10));

            printWriter.println("some more data below....");
        } catch (UnsupportedEncodingException | FileNotFoundException ex) {
            Logger.getLogger(GenerateFiles.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    
}
