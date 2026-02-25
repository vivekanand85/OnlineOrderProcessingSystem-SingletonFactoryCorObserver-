package MiniProject;

import java.util.*;

interface Observer{
	void update(String status);
}

class Customer implements Observer{
	public void update(String status) {
		System.out.println("Customer notified; "+status);
	}
}
public class ObserverPatternOrderNotification {
 private List<Observer> observers=new ArrayList<>();
 
 void subscribe(Observer o) {
	 observers.add(o);
 }
 
 void notifyUsers(String status) {
	 for(Observer o:observers) {
		 o.update(status);
	 }
 }
}
