/**
 * Explications ici
 * 
 * @author El babili - 2021
 * 
 */

package fr.ldnr.flux;

import java.io.*;
import java.util.*;

public class TestBufferedWriter {
  public static void main(String args[]) { 
    try {
      int nombre = 12345;
      BufferedWriter fichier = new BufferedWriter(new FileWriter("source.txt"));

      fichier.write("bonjour le groupe Java SE LDNR 2021");
      fichier.newLine();
      fichier.write("Nous sommes le "+ new Date());      
      fichier.write("\nle pwd est " + nombre);

      fichier.close();
    } catch (Exception e) {
      e.printStackTrace();
    }     
  }    
}