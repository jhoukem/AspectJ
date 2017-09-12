package clients;

import java.util.ArrayList;

public class Clients {

	private ArrayList<Client> clients = new ArrayList<Client>();

	public void addClient(Client c){
		clients.add(c);
	}

	public void delClient(Client c){
		if(!c.hasOrder()){
			clients.remove(c);
		}
	}

	public void printClients(){
		for(Client c : clients){
			c.printOrderList();
		}
	}
	
}
