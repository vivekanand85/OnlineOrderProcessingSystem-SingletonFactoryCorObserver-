package MiniProject;



interface Order{
	void placeOrder();
}

class FoodOrder implements Order{
	public void placeOrder() {
		System.out.println("Food order placed");
	}
}

class ElectronicOrder implements Order{
	public void placeOrder() {
		System.out.println("Electronic order placed");
	}
}
public class FactoryPatternOrderCreation {	
	public static Order createOrder(String type) {
		if(type.equalsIgnoreCase("food")) {
			return new FoodOrder();
		}
		else if(type.equalsIgnoreCase("electronic")) {
			return new ElectronicOrder();
		}
		
		return null;
	}
}
