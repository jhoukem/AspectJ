package aspectj;

import java.util.ArrayList;

import orders.Order;
import clients.Client;

public aspect AClientOrder {

	// Client.
	private ArrayList<Order> Client.orders = new ArrayList<Order>();
	public void Client.addOrder(Order o){
		if(o.getClient() != null){
			o.getClient().delOrder(o);
		}
		orders.add(o);
		o.setClient(this);
	}
	public boolean Client.hasOrder(){
		return !orders.isEmpty();
	}
	public void Client.delOrder(Order o){
		orders.remove(o);
	}
	public void Client.printOrderList(){
		System.out.println("Client["+this.name+"] orders:");
		System.out.println("Order");
		for (Order o : orders) {
			o.printOrder();
		}
	}
	
	// Order.
	private Client Order.client;
	public void Order.setClient(Client c){
		client = c;
	}
	
	public Client Order.getClient(){
		return client;
	}
	
	public void Order.printOrder(){
		System.out.println(this.toString()+", "+client.toString());
	}
	
	
}
