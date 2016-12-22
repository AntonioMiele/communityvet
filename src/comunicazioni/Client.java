import java.net.Socket;

public class Client {

	//Identifica il client della chat
	
	private String nome;
	private Socket socket;
	
	public Client(String nome, Socket socket){
	
		this.nome=nome;
		this.socket=socket;
		
	}
	
	private String getNome(){
		return nome;
	}
	
	private void setNome(String nuovoNome){
		nome=nuovoNome;
	}
	
	private Socket getSocket(){
		return socket;
	}
	
	private void setSocket(Socket nuovoSocket){
		socket=nuovoSocket;
	}
	
}
