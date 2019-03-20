/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AIS;
import java.io.*;
import java.net.URISyntaxException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Chandan
 */
public class WhatSay {
    int Select; 
    String msg,link;

   public int Number(int Length)
   { Random random=new Random();
    Select=random.nextInt(Length);
   
   return Select;
   }
    
    
    
    public  String Decide(String s,String name) throws IOException, URISyntaxException
       {  
        
           if(s.equalsIgnoreCase("Hii")||s.equalsIgnoreCase("Hello")||s.equalsIgnoreCase("hiii")||s.equalsIgnoreCase("hello karl")) 
           { msg="Hello "+ name +",How Are You?";
             
           }
           else  if(s.equalsIgnoreCase("thanks")||s.equalsIgnoreCase("thank you")||s.equalsIgnoreCase("thank you")) 
           { msg="Most welcome "+ name +",its my pleasure to help you";
             
           }
           
           
           else if(s.equalsIgnoreCase("clear")||s.equalsIgnoreCase("clearscreen")||s.equalsIgnoreCase("clear this screen"))
           {   msg="Please use clear button given below,Mr."+name;
           } 
           else if(s.equalsIgnoreCase("hehe")||s.equalsIgnoreCase("Haha")||s.equalsIgnoreCase("laugh")) 
           {   if(s.equalsIgnoreCase("laugh"))
                msg="haahaahaahaahaahaahaahaahaa.....thank you,"+name;
                else{msg="haaaaaah haaaaah ";}
           }
           else if(s.equalsIgnoreCase("open vlc")||s.equalsIgnoreCase("vlc")||s.equalsIgnoreCase("play a song for me"))
           {
             try {
              Process pr;
              pr = Runtime.getRuntime().exec("\"C:\\Program Files\\VideoLAN\\VLC\\vlc.exe\"");
       } catch (IOException ex) {
           Logger.getLogger(InterFace.class.getName()).log(Level.SEVERE, null, ex);
       }
             msg="Starting Vlc player for you...its easy to use..!";
           
           }
           
           else if(s.equalsIgnoreCase("whatsup")||s.equalsIgnoreCase("whatsup?")||s.equalsIgnoreCase("How are You")||s.equalsIgnoreCase("How are You?"))
           {    if(s.equalsIgnoreCase("whatsup")||s.equalsIgnoreCase("whatsup?"))
                {  msg="Nothing Special," + name +"Start Exploring in Search Box for better Usage";
                } else{msg= "I'm good !! And always Ready To Help You.." + name; }    
           }
           else if(s.equalsIgnoreCase("Site Google")||s.equalsIgnoreCase("open Google")||s.equalsIgnoreCase("google"))
           {   
               link="http://www.google.com";
               new OpenUrl().open(link);
               msg="Opening Google...";
           }
            else if(s.equalsIgnoreCase("Site youtube")||s.equalsIgnoreCase("open youtube")||s.equalsIgnoreCase("youtube"))
           { 
               link="http://www.youtube.com";
               new OpenUrl().open(link);
           msg="Opening Youtube...";
           }
           else if(s.equalsIgnoreCase("Site facebook")||s.equalsIgnoreCase("open facebook")||s.equalsIgnoreCase("facebook"))
           { 
              link="http://www.facebook.com";
               new OpenUrl().open(link);
           msg="Opening FaceBook...";
           }
           
           
           
           
           else{ 
               String Message[]={"Sorry,Not A Valid Command...",
                                 "I'm Not Programmed For This..."
                                 ,"Try Again Not A Valid Command"
                                 ,"Sorry,I Don't Know What TO Do For This.."};
              msg=Message[Number(Message.length)];
             }
           new ReturnVoice(msg);
           return msg;
       }
      
}