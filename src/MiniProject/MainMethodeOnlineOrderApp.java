package MiniProject;

public class MainMethodeOnlineOrderApp {

	public static void main(String[]args) {
		LoggerSIngleton logger=LoggerSIngleton.getInstance();
		logger.log("Application started");
		
		Order order=FactoryPatternOrderCreation.createOrder("food");
		order.placeOrder();
		
		COROrderVal payment=new PaymentValidation();
		COROrderVal stock =new StockValidation();
		COROrderVal delivery=new DeliveryValidation();
		payment.setNext(stock);
		stock.setNext(delivery);
		payment.validate();
		
		ObserverPatternOrderNotification status=new ObserverPatternOrderNotification();
		status.subscribe(new Customer());
		status.subscribe(new Customer());
		
		status.notifyUsers("Orderr place succesfuullly");
	}
}
