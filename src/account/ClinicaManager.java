package account;

import java.util.ArrayList;

public class ClinicaManager {
	
	private ArrayList<Clinica> cliniche = new ArrayList<Clinica>();
	
	public ClinicaManager(ArrayList<Clinica> cliniche){
		this.cliniche=cliniche;
	}

	public ArrayList<Clinica> getCliniche() {
		return cliniche;
	}
	
	public void addClinica(Clinica cl){
		cliniche.add(cl);
	}
	
	public void deleteClinica(Clinica cl){
		cliniche.add(cl);
	}
	
	public Clinica cercaClinica(String nomeClinica){
		
		for(Clinica c:cliniche){
			if(c.getNome()==nomeClinica)
				return c;
			else
				System.out.println("Non esiste alcuna clinica con il nome: "+nomeClinica);
				return null;
		}
		
		return null;
	}

}
