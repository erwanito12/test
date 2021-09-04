/**
 * Explications ici
 * 
 * @author El babili - 2021
 * 
 */

package fr.ldnr.flux;

import java.io.*;

public class TestBufferedReader {

  public static void main(String args[]) {
    try {
      String ligne ;
      BufferedReader fichier = new BufferedReader(new FileReader("source.txt"));	
      //fileReader lit des caractères qui sont stockés dans un buffer ou tampon grâce au filtre BufferedReader
      //delors on peut appeler des méthodes qui lisent des lignes comme ici       
      while ((ligne = fichier.readLine()) != null) {
          System.out.println(ligne);
      }

      fichier.close();
    } catch (Exception e) {
      e.printStackTrace();
    }     
  }    
}