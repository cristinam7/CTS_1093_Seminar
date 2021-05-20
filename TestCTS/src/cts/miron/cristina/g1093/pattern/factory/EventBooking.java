package cts.miron.cristina.g1093.pattern.factory;

public class EventBooking extends OnlineBooking {

	int maxNoOfParticipants;
	
	public EventBooking(String eventName, int price, int noParticipants) {
		super(eventName, price);
		this.maxNoOfParticipants = noParticipants;
	}

	@Override
	public String getType() {
		return EventType.EVENTS.toString();
	}

}
