/**
 * Explications ici
 * 
 * @author El babili - 2021
 * 
 */

package fr.ldnr.flux;

import java.io.*;
import java.util.*;

public class TestPrintWriter {

  public static void main(String []args) { 
    try {
      int nombre = 123;
      PrintWriter fichier = new PrintWriter(new FileWriter("print1.txt"));

      fichier.println("bonjour tout le monde");
      fichier.println("Nous sommes le "+ new Date());      
      fichier.println("le nombre magique est " + nombre);

      fichier.close();
    } catch (Exception e) {
    	System.out.println("Houston we have a pb");
      e.printStackTrace();
    }     
    
    System.out.println("ok step 1");
    
    /*------------------autre constructeur/autre manière-----------------*/
    
    try{
	    PrintWriter writer = new PrintWriter("print2.txt", "UTF-8");
	    writer.println("The first line");
	    writer.println("The second line");
	    writer.close();
    }
    catch (IOException e){
      System.out.println("Houston we have an other pb");
      e.printStackTrace();
    }
    
    System.out.println("ok step 2");
    
  }    
}