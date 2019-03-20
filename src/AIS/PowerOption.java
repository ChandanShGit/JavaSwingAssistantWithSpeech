/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AIS;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chandan
 */
public class PowerOption {
  String cmd,Lmsg; 
  int time=0;
  
  
  
  final public void option(int op,int t)
  {
  time=t;  //op=1 for shutdown,2 for restart,3 for hibernate,4 for logging off
  option(op);
  }
  
  
  
  
 final public void option(int op)
  {
       operation(op);
  
  }
  
  public String messagepowerlabel(int index) {
     switch(index){
         case 1:Lmsg="Hibernate PC";
         break;
         case 2:Lmsg="PowerOff/ShutDown Your PC";
         break;
         case 3:Lmsg="Restart Your PC";
         break;
         default:Lmsg="Power Switching Option"; 
     }
  
  
  
  
  return Lmsg;
  }
   
   void  operation(int a)
    { 
    switch(a)
    {
        case 1:cmd="shutdown -s -t "+time;       
        break;
        case 2:cmd="restart -r -t "+time;
        break;
        case 3:cmd="restart -h ";   // hibernate
        break;
        case 4:cmd="shutdown -l";    // logoff
        break;
    }
      try {
          Runtime.getRuntime().exec(cmd);
          } catch (IOException ex) {
          Logger.getLogger(PowerOption.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
}
