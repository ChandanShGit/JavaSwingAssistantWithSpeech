/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AIS;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Chandan
 */

public class OldPass {
String Ab;
    /**
     *
     * @return
     */
   
    public  String old()
    {
       try{ 
           BufferedReader br;
           br = new BufferedReader(new FileReader("password.txt"));

if((Ab=br.readLine())!=null)
            br.close();
          
     else
       { 
               JOptionPane.showMessageDialog(null,"Error In Loading Files... Reinstallation Required");
       }     
        }catch(HeadlessException | IOException e){e.getMessage();}
    return Ab;
    
    }

}
