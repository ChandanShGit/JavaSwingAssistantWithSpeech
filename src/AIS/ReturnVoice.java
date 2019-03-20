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
import com.sun.speech.freetts.*;
 

public class ReturnVoice extends Thread {
   final String Voicename="kevin16";
   final String s;
   Voice voice;
   
   ReturnVoice(String s) 
  {
     this.s=s;
     start(); 
    
  }
  @Override
   public void run(){
        VoiceManager vm=VoiceManager.getInstance();
        voice=vm.getVoice(Voicename);
        voice.allocate();
        voice.speak(s);               
   }
  


}
