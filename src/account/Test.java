package account;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		Clinica proxy = new Clinica(1,"Proxy","Avellino",812345997,"via verdi,11","proxy@gmail.com");
		@SuppressWarnings("deprecation")
		Date d=new Date(1994,04,23);
		AccountVeterinario luca = new AccountVeterinario("lucasss", "dsjn",
				"luca","napolitano",d,"Nola","Nola","via garibaldi, 4",33767999,"Proxy", proxy);
		
		System.out.println(luca.getCognome());

	}

}
