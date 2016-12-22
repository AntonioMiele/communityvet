import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Chat {

	//Rappresenta lo scambio di messaggi tra client e server
	
	private Client client;
	private Server server;
	private ArrayList<String> testo;
	
	public Chat(){
		try {
			ServerSocket serverSocket= new ServerSocket(8000);
			Socket socket = serverSocket.accept();
			server= new Server("localhost",socket,serverSocket);
			client= new Client("localhost",socket);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private Client getClient(){
		return client;
	}
	
	private Server getServer(){
		return server;
	}
	
	public ArrayList<String> getTesto(){
		return testo;
	}
	
	public void setTesto(ArrayList<String> messaggio){
		testo.clear();
		testo=messaggio;
	}
	
}
