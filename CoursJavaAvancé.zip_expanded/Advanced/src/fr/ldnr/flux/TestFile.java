/**
 * Explications ici
 * 
 * @author El babili - 2021
 * 
 */

package fr.ldnr.flux;
import java.io.File;

public class TestFile  {
	  public static void main(String[] args) {		
		    File f = new File("test.txt");
		    System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());
		    System.out.println("Nom du fichier : " + f.getName());
		    System.out.println("Est-ce qu'il existe ? " + f.exists());
		    System.out.println("Est-ce un répertoire ? " + f.isDirectory());
		    System.out.println("Est-ce un fichier ? " + f.isFile());
		
		    System.out.println("Affichage des lecteurs à la racine du PC : ");
		
		    for(File file : File.listRoots()) {
			      System.out.println(file.getAbsolutePath());
			      try {
				        int i = 1; 
				        //On parcourt la liste des fichiers et répertoires de chaque lecteur
				        for(File nom : file.listFiles()){
					          //S'il s'agit d'un dossier, on ajoute un "/"
					          System.out.print("\t\t\t" + ((nom.isDirectory()) ? nom.getName()+"-/" : nom.getName()));		
					          if((i%4) == 0){			  // opérateur ternaire : condensé de if/else	
					            System.out.print("\n");	
					          }
					          i++;	
				        }
				        System.out.println("\n");
			      } 
			      catch (NullPointerException e) {	    	  
			    	  e.printStackTrace();	    	  
			      }
		    }
	  }
}