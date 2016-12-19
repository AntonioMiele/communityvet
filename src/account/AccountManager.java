package account;

import java.util.ArrayList;
public class AccountManager {
	
	private ArrayList<Account> account = new ArrayList<Account>();
	
	public AccountManager(ArrayList<Account> account){
		this.account=account;
	}
	
	public void addAccount(Account acc){
		account.add(acc);
	}
	
	public void deleteAccount(Account acc){
		account.remove(acc);
	}

	public ArrayList<Account> getUtenti() {
		return account;
	}
	
	public Account cercaUtente(String username){
		for(Account x:account){
			if (x.getUsername()==username){
				return x;
			}
			else
			{
				System.out.println("Non esiste alcun utente con l'username: "+username);
				return null;
			}
		}
		return null;
	}

}
