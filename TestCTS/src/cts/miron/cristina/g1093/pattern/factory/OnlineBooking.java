package cts.miron.cristina.g1093.pattern.factory;

public abstract class OnlineBooking {
	
	String eventName; 
	int price;
	
	public OnlineBooking(String eventName, int price) {
		super();
		this.eventName = eventName;
		this.price = price;
	} 
	
	public abstract String getType();

    public void displayDescription() {
        System.out.println(
                String.format("It's a %s type ticket for %s with a price of %d", this.getType(), eventName, price));
    }
	

}
