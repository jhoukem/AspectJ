package main;

import clients.Client;
import orders.Order;

public class MainSingleton {


	public static void main(String[] args) {
		Client client1 = new Client("client1", "adr1");
		Client client2 = new Client("client2", "adr2");
		System.out.println("Client 1 == Client2 ? "+ (client1==client2));
		System.out.println(client1.toString());

		Order order1 = new Order(1, 1);
		Order order2 = new Order(2, 2);
		System.out.println("Order1 == Order2 ? "+(order1 == order2));	
		System.out.println(order1.toString());
	}
}
