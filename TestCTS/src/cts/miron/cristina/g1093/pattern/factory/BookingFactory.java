package cts.miron.cristina.g1093.pattern.factory;

public class BookingFactory {

	public static OnlineBooking getBooking(EventType type, String eventName, int price) { 
		
		OnlineBooking booking = null; 
		
		switch(type) { 
			case CONCERTS: 
				booking = new ConcertBooking(eventName, price, "TheBeattles");
				break; 
			case EVENTS: 
				booking = new EventBooking(eventName, price, 100); 
				break; 
			case MUSEUMS: 
				booking = new MuseumBooking(eventName, price); 
				break; 
			default: 
				throw new UnsupportedOperationException();
		}
		
		return booking;		
	}
	
}
