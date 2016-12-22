import java.util.ArrayList;

public class ChatManager {
		
	//Gestiste la chat tra client e server
	
	private Chat chat;
	
	public ChatManager(){
		chat = new Chat();
	}
	
	private void inviaMessaggio(ArrayList<String> messaggio){
		chat.setTesto(messaggio);
	}
	
	private void visualizzaMessaggio(){
		System.out.println(chat.getTesto());
	}
	
}
