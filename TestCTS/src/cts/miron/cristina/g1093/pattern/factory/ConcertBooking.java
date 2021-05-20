package cts.miron.cristina.g1093.pattern.factory;

public class ConcertBooking extends OnlineBooking {

	String bandName;
	
	public ConcertBooking(String eventName, int price, String band) {
		super(eventName, price);
		this.bandName = band;
	}

	@Override
	public String getType() {
		return EventType.CONCERTS.toString(); 
	}

}
