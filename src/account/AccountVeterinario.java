package account;

import java.util.Date;

public class AccountVeterinario extends Account {

	public AccountVeterinario(String username, String password, String nome, String cognome, Date dataDiNascita,
			String luogoDiNascita, String comuneDiResidenza, String indirizzo, long numeroDiTelefono, String nomeClinica,
			Clinica clinica) {
		super(username, password, nome, cognome, dataDiNascita, luogoDiNascita, comuneDiResidenza, indirizzo, numeroDiTelefono,
				nomeClinica, clinica);
		
	}

}
