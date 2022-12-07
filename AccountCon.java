package mani;

public class AccountCon {
	
	
	String account_name="bob";

	int number=20039099;
	
	int balence=500030;
	
	int credit;
	
	int debit;
	
	String account_type;
	
	AccountCon(int cre,int deb){
       credit=cre;
       debit=deb; }                                        
	  
	AccountCon(int cre,int deb,String acc_type){
		credit=cre;
		debit=deb;
	account_type=acc_type;
		
	}
	
	public static void main(String[] args) {
		AccountCon a0=new AccountCon(20000,2500);
		AccountCon a1=new AccountCon(20000,2500,"manual");
		
		System.out.println(a0.credit);
		System.out.println(a0.debit);
		System.out.println(a1.credit);
		System.out.println(a1.debit);
		System.out.println(a1.account_type);
		
		
		
		// TODO Auto-generated method stub

	}

}
