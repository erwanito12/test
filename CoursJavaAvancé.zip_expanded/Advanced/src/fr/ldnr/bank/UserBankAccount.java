package fr.ldnr.bank;
			
			//utilisateur de compte bancaire
public class UserBankAccount implements Runnable {
	  private BankAccount cb;
	  private String name;

	  public UserBankAccount(BankAccount cb, String name){
	    this.cb = cb;
	    this.name = name;
	  }

	  public void run() {
	    for(int i = 0; i < 15; i++){
	      if(cb.getBalance() > 0){
	        cb.retrait(2,this.name);	                             
	      }                       
	    }               
	  } 
}