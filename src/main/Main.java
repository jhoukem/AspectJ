package main;

import clients.Client;
import clients.Clients;
import orders.Order;
import orders.Orders;

public class Main {
	public static void main(String[] args) {
		Clients clients = new Clients();
		Orders orders = new Orders();
		
		Client client1 = new Client("1", "FR");
		Client client2 = new Client("2", "US");
		
		clients.addClient(client1);
		clients.addClient(client2);
		
		Order order1 = new Order(1, 5);
		Order order2 = new Order(2, 10);
		
		orders.addOrder(order1);
		orders.addOrder(order2);
		
		
		client1.addOrder(order1);
		client2.addOrder(order2);
		System.out.println("1-----------------------------------------------Affect order for two clients");
		orders.printOrders();
		clients.printClients();
		
		client1.addOrder(order2);
		System.out.println("2-----------------------------------------------Affect client 2 order to client 1");
		orders.printOrders();
		clients.printClients();
		
		clients.delClient(client1);
		System.out.println("3-----------------------------------------------Try to delete client 1");
		clients.printClients();
		
		clients.delClient(client2);
		System.out.println("4-----------------------------------------------Try to delete client 2");
		clients.printClients();
		
	}
}
