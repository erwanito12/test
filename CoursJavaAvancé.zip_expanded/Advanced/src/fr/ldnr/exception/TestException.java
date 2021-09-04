package fr.ldnr.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
	public static void main(String[] args) {
		int [] tablo = { 2, 45, 6, 78, 95};
			//indice :   0  1   2  3   4		tablo[0] contient la valeur 2 ...
		int val = 0;
		Scanner scan = new Scanner(System.in);
		
		while(val++ < 5) {
			System.out.println("selectionner un indice de 0 à 4 pour voir la valeur correspondante ");			
			try {
				int indice = scan.nextInt();	//nous devrions vérifier si l'indice est dans l'intervalle
				System.out.println("valeur à l'indice " + indice + " : " + tablo[indice]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("vous avez saisi une valeur en dehors des indices du tableau -> " + e.getMessage());
			}
			catch(InputMismatchException e) {
				System.out.println("vous avez saisi une valeur inattendue ici, pb de type !");
				e.printStackTrace();
			}
			finally {
				System.out.println("on passe toujours par ici :)");
				scan.nextLine();
			}
		}
		scan.close();
	}
}
