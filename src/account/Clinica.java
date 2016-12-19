package account;

public class Clinica {
	
	private int id;
	private String nome;
	private String citt�;
	private long numeroDiTelefono;
	private String indirizzo;
	private String email;
	
	public Clinica(int id, String nome, String citt�, long numeroDiTelefono, String indirizzo,
			String email){
		this.id=id;
		this.nome = nome;
		this.citt� = citt�;
		this.numeroDiTelefono = numeroDiTelefono;
		this.indirizzo = indirizzo;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCitt�() {
		return citt�;
	}

	public long getNumeroDiTelefono() {
		return numeroDiTelefono;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public String getEmail() {
		return email;
	}
	
	

}
