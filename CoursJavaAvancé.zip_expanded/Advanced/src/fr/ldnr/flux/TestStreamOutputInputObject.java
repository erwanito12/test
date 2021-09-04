package fr.ldnr.flux;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestStreamOutputInputObject {
	  public static void main(String[] args) {
		    ObjectInputStream ois;
		    ObjectOutputStream oos;
		    try {
		      oos = new ObjectOutputStream( new BufferedOutputStream( new FileOutputStream( new File("stars.txt"))));            
		
		      //Nous allons écrire chaque objet Game dans le fichier
		      oos.writeObject(new Star("Potter","Harry","Poudlard"));
		      oos.writeObject(new Star("Andersen","Neo","Matrix"));
		      oos.writeObject(new Star("De Funes","Louis","Vadrouille"));
		      oos.close();
		
		      //On récupère maintenant les données !
		      ois = new ObjectInputStream( new BufferedInputStream( new FileInputStream( new File("stars.txt"))));            
		
		      try {
		        System.out.println("Affichage des célébrités :");		   
		        System.out.println(((Star)ois.readObject()).toString());
		        System.out.println(((Star)ois.readObject()).toString());
		        System.out.println(((Star)ois.readObject()).toString());
		      } catch (ClassNotFoundException e) {
		        e.printStackTrace();
		      }
		      ois.close();
		    } catch (FileNotFoundException e) {
		      e.printStackTrace();
		    } catch (IOException e) {
		      e.printStackTrace();
		    }       
	  }
	  
	  private static class Star implements Serializable {	//définition d'une classe interne forçément statique
			  private String lastName;
			  private String firstName;
			  private String celebrity;
			  
			public Star(String lastName, String firstName, String celebrity) {
				this.lastName = lastName;
				this.firstName = firstName;
				this.celebrity = celebrity;
			}

			@Override
			public String toString() {
				return "Star [lastName=" + lastName + ", firstName=" + firstName + ", celebrity=" + celebrity + "]";
			}		
	  }
}
