package fr.ldnr.flux;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class TestFileStream {
   public static void main(String[] args) {
      FileInputStream fis = null;
      FileOutputStream fos = null;            
      try {
         fis = new FileInputStream(new File("test.txt"));	// l'objet fis va lire dans le fichier test.txt
         fos = new FileOutputStream(new File("test2.txt")); // l'objet fos va écrire dans le fichier test2.txt
         byte[] buf = new byte[8];	//buffer contenant 8 octets/bytes d'informations lues à chaque tour de boucle

         while ((fis.read(buf)) >= 0) {		//tant qu'on peut lire le fichier / -1 fait sortir
            // On écrit dans le fichier de destination
            fos.write(buf);
            // On affiche sur la console ce qu'on a lu
            for (byte octet : buf) {
            	if(octet != 0)	System.out.print((char) octet);
            }
            for (byte octet : buf)  System.out.print("(" + octet + ")");
            
            //on réinitialise le buffer sans quoi on risque d'afficher des données déjà lues
            for (int i = 0 ; i<buf.length ; i++)  buf[i] = 0;
         }
         System.out.println("Copie terminée !");
         
      } catch (FileNotFoundException e) {
         // Cette exception est levée si l'objet FileInputStream ne trouve aucun fichier
         e.printStackTrace();

      } catch (IOException e) {
         // Celle-ci se produit lors d'une erreur d'écriture ou de lecture
         e.printStackTrace();
      } finally {
         // On ferme nos flux de données dans un bloc finally pour s'assurer
         // que ces instructions seront exécutées dans tous les cas même si une exception est levée !
         try {
            if (fis != null)	fis.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
         try {
            if (fos != null)	fos.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }
}