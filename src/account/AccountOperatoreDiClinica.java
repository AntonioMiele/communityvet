package account;

import java.util.Date;

public class AccountOperatoreDiClinica extends Account {

	public AccountOperatoreDiClinica(String username, String password, String nome, String cognome, Date dataDiNascita,
			String luogoDiNascita, String comuneDiResidenza, String indirizzo, int numeroDiTelefono, String nomeClinica,
			Clinica clinica) {
		super(username, password, nome, cognome, dataDiNascita, luogoDiNascita, comuneDiResidenza, indirizzo, numeroDiTelefono,
				nomeClinica, clinica);
		
	}

}
