package account;

import java.util.Date;


public class AccountPadroneAnimale extends Account {
	
	private String codiceFiscale;
	private String email;

	public AccountPadroneAnimale(String username, String password, String nome, String cognome, Date dataDiNascita,
			String luogoDiNascita, String comuneDiResidenza, String indirizzo, int numeroDiTelefono, String nomeClinica,
			Clinica clinica, String codiceFiscale, String email) {
		super(username, password, nome, cognome, dataDiNascita, luogoDiNascita, comuneDiResidenza, indirizzo, numeroDiTelefono,
				nomeClinica, clinica);
		this.codiceFiscale=codiceFiscale;
		this.email=email;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public String getEmail() {
		return email;
	}
	
	

}
