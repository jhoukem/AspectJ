package orders;

import java.util.ArrayList;

public class Orders {

	private ArrayList<Order> orders = new ArrayList<Order>();
	
	public void addOrder(Order o){
		orders.add(o);
	}
	
	public void delOrder(Order o){
		orders.remove(o);
	}
	
	public void printOrders(){
		for(Order o : orders){
			o.printOrder();
		}
	}
}
