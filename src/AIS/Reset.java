/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AIS;

/**
 *
 * @author Chandan
 */
import java.io.*;
public class Reset {
    
    /**
     *
     * @param passc
     * @throws IOException
     */
    public void change(String passc) throws IOException
{        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("password.txt"))) {
            bw.write(passc);
            System.out.println("Running reset ok");
            bw.close();
        }
}
}
