import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	//Identifica il server della chat
	
	private String nome;
	private Socket socket;
	private ServerSocket connessione;
	
	public Server(String nome, Socket socket, ServerSocket connessione){
	
		this.nome=nome;
		this.socket=socket;
		this.connessione=connessione;
		
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
	
	private ServerSocket getConnessione(){
		return connessione;
	}
	
	private void setConnessione(ServerSocket newConnessione){
		connessione=newConnessione;
	}
	
}
