/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author re
 */
public final class ReadParseFiles {

    private static volatile ReadParseFiles instance = null;
    
    private ReadParseFiles() { }
    
    public static ReadParseFiles getInstance() {
        if (instance == null) {
            synchronized(ReadParseFiles.class) {
                if (instance == null) {
                    instance = new ReadParseFiles();
                }
            }
        }
        System.out.println("Ok, masz pan singlet.. ee, ParseFilesa.");
        return instance;
    }
    
//    private ArrayList<String> listFiles() {
//        
//    }
}
