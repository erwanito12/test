/**
 * Explications ici
 * 
 * @author El babili - 2021
 * 
 */

package fr.ldnr.exception;

public class TestThrow {
	public static void main(String[] args) {		
		//1ère manière : anticiper et générer une exception 
//		double a = 5, b = 0;	//en effet, on ne doit surtout pas laisser faire cette opération
//		if(b == 0)	throw new RuntimeException("Impossible de diviser par zéro !");
		//malheureusement le programme s'arrête ici
		
		//2ème manière : c'est une méthode qui peut générer une exception que nous capturons
		try {			
			Operations(0, 0);
		} catch (java.lang.ArithmeticException ae) {
			System.out.println("C'est une exeption arithmétique ! " + ae.getMessage());
		} catch (Exception e) {
			System.out.println("C'est une exception ! " + e.getMessage());
		}		
		finally {
			System.out.println("on passe toujours par ici");
		}
		
		System.out.println("le programme peut continuer sans problème ...");
	}
	
	public static void Operations(double a, double b) throws ArithmeticException , Exception {
		double c = 0;
		if(b == 0)	throw new ArithmeticException(" div par zéro ");
		else if(a == 0 && b == 0)	throw new Exception(" 0 / 0 donne aussi l'infini");	
		else c = a/b;
	}
	
	/*public static void main(String[] args) {
		System.out.println(5/0);
	}*/
}
