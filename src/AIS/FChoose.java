/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AIS;

import java.awt.HeadlessException;
import java.io.File;
import javax.swing.JFileChooser;
  
class FChoose  {
  String Path;
    public String Show(){
         try{
         JFileChooser jfc=new JFileChooser();
         jfc.showOpenDialog(new JFileChooser());  
         File f=jfc.getSelectedFile();
         Path=f.getAbsolutePath();
        }
         catch(HeadlessException e){e.getMessage();}
         return Path;
    }

}