package clients;

public class Client {

	public String name, address;
//	private ArrayList<Order> orders = new ArrayList<Order>();

	public Client(String name, String address) {
		this.name = name;
		this.address = address;
	}

//	public void addOrder(Order o){
//		if(o.getClient() != null){
//			o.getClient().delOrder(o);
//		}
//		orders.add(o);
//		o.setClient(this);
//	}

//	public boolean hasOrder(){
//		return !orders.isEmpty();
//	}
//
//	public void delOrder(Order o){
//		orders.remove(o);
//	}

//	public void printOrderList(){
//		System.out.println("Client["+name+"] orders:");
//		for (Order o : orders) {
//			o.printOrder();
//		}
//	}

	@Override
	public String toString() {
		return "Client["+name+"], Address ["+address+"]";
	}
}
