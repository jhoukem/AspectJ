package main;

import clients.Client;
import clients.Clients;
import orders.Order;
import orders.Orders;

public class MainSeq {
	public static void main(String[] args) {
		Clients clients = new Clients();
		Orders orders = new Orders();
		
		Order order = new Order(1, 40);
		Client client = new Client("client1", "adr1");
		
		clients.addClient(client);
		orders.addOrder(order);
		
		client.addOrder(order);
		clients.delClient(client);

		client.delOrder(order);
		
		clients.delClient(client);
	}
}
