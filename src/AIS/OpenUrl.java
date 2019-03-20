/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AIS;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

 /**
 *
 * @author Chandan
 */

public class OpenUrl {

           String msg;
           
           public void open(String link) throws URISyntaxException{
           try { 
                 Desktop.getDesktop().browse(new URL(link).toURI());
               } catch (IOException ex) {
                 Logger.getLogger(OpenUrl.class.getName()).log(Level.SEVERE, null, ex);
               }
 }
 }

