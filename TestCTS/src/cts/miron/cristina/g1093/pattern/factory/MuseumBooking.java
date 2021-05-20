package cts.miron.cristina.g1093.pattern.factory;

public class MuseumBooking extends OnlineBooking {

	public MuseumBooking(String eventName, int price) {
		super(eventName, price);
	}

	@Override
	public String getType() {
		return EventType.MUSEUMS.toString();
	}

}
