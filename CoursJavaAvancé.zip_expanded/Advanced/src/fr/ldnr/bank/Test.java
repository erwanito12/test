package fr.ldnr.bank;

public class Test {
	  public static void main(String[] args) {
	    BankAccount cb = new BankAccount();
	    //CompteEnBanque cb2 = new CompteEnBanque();

	    Thread pedro = new Thread(new UserBankAccount(cb, "pedro"));
	    Thread sancho = new Thread(new UserBankAccount(cb, "sancho"));
	    pedro.start();
	    sancho.start();
	  }
}