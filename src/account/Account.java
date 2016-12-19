package account;

import java.util.Date;

public class Account {
	private String username;
	private String password;
	private String nome;
	private String cognome;
	private Date dataDiNascita;
	private String luogoDiNascita;
	private String comuneDiResidenza;
	private String indirizzo;
	private long numeroDiTelefono;
	private String nomeClinica;
	private Clinica clinica;
	
	public Account(String username, String password, String nome, String cognome,
			Date dataDiNascita, String luogoDiNascita, String comuneDiResidenza, String indirizzo,
			long numeroDiTelefono, String nomeClinica, Clinica clinica){
		this.username = username;
		this.password = password;
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.luogoDiNascita = luogoDiNascita;
		this.comuneDiResidenza = comuneDiResidenza;
		this.indirizzo = indirizzo;
		this.numeroDiTelefono = numeroDiTelefono;
		this.clinica = clinica;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public Date getDataDiNascita() {
		return dataDiNascita;
	}

	public String getLuogoDiNascita() {
		return luogoDiNascita;
	}

	public String getComuneDiResidenza() {
		return comuneDiResidenza;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public long getNumeroDiTelefono() {
		return numeroDiTelefono;
	}

	public String getNomeClinica() {
		return nomeClinica;
	}

	public Clinica getClinica() {
		return clinica;
	}

	
	
	
}

