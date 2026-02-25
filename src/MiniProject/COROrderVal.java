package MiniProject;

abstract public class COROrderVal {
	protected COROrderVal next;
	
	void setNext(COROrderVal next) {
		this.next=next;
	}
	
	abstract void validate();
}

class PaymentValidation extends COROrderVal{
	void validate() {
		LoggerSIngleton.getInstance().log("payemeny validated");
		if(next!=null) next.validate();
	}
}

class StockValidation extends COROrderVal{
	void validate() {
		LoggerSIngleton.getInstance().log("Stock validate");
		if(next!=null) next.validate();
	}
}

class DeliveryValidation extends COROrderVal{
	void validate() {
		LoggerSIngleton.getInstance().log("Delivey validated");
		if(next!=null) next.validate();
	}
}
