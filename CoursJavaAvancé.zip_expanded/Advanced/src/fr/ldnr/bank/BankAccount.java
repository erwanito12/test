package fr.ldnr.bank;
			// Ressources compte bancaire
public class BankAccount {
	  private int balance = 20;	//Solde 

	  public int getBalance(){
	    if(this.balance < 0)
	      System.out.println("Vous êtes à découvert !");
	    return this.balance;
	  }

	  public synchronized void retrait(int retrait , String name){
		  balance = balance - retrait; 
	      System.out.println("Solde compte = " + balance);    
	      System.out.println("Retrait effectué par " + name);  
	  }
}