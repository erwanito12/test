/**
 * Explications ici
 * 
 * @author El babili - 2021
 * 
 */

package fr.ldnr.flux;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
	public static void main(String[] args) {
		 try {
		      FileWriter myWriter = new FileWriter("print3.txt");
		      myWriter.write("ça en fait des manières de travailler sur des fichiers en Java");
		      myWriter.close();
		    } 
		    catch (IOException e) {
		      System.out.println("PROBLEM !");
		      e.printStackTrace();
		    }
	}

}
