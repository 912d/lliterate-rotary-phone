/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author re
 */
public final class ReadParseFilesNotThreadSafe {

    private static volatile ReadParseFilesNotThreadSafe instance = new ReadParseFilesNotThreadSafe();
    
    private ReadParseFilesNotThreadSafe() { }
    
    public static ReadParseFilesNotThreadSafe getInstance() {
        if (instance == null) {
            synchronized(ReadParseFilesNotThreadSafe.class) {
                if (instance == null) {
                    instance = new ReadParseFilesNotThreadSafe();
                }
            }
        }
        System.out.println("Ok, masz pan not thread safe singlet.. ee, ParseFilesa.");
        return instance;
    }
    
}
