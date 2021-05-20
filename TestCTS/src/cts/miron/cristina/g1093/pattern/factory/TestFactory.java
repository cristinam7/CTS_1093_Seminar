package cts.miron.cristina.g1093.pattern.factory;

public class TestFactory {

	public static void main(String[] args) {
		
		OnlineBooking booking1 = BookingFactory.getBooking(EventType.MUSEUMS, "History Museum", 20); 
		booking1.displayDescription();
		
		OnlineBooking booking2 = BookingFactory.getBooking(EventType.CONCERTS, "Trilogy", 150); 
		booking2.displayDescription();
		
		OnlineBooking booking3 = BookingFactory.getBooking(EventType.EVENTS, "Wedding", 0); 
		booking3.displayDescription();
		
		OnlineBooking booking4 = BookingFactory.getBooking(EventType.EVENTS, "Product Launching", 50); 
		booking4.displayDescription();
		
	}
	
}
