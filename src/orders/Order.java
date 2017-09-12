package orders;

public class Order {
	
	public int id;
	public double amount;
//	private Client client;
	
	public Order(int id, double amount) {
		this.id = id;
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Order["+id+"] x"+amount;
	}
	
//	public void setClient(Client c){
//		client = c;
//	}
//	
//	public Client getClient(){
//		return client;
//	}
	
//	public void printOrder(){
//		System.out.println("Order["+id+"], amount: "+amount+", "+client.toString());
//	}
}
