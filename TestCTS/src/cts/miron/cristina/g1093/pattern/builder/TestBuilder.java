package cts.miron.cristina.g1093.pattern.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
		Booking booking1 = new Booking.BookingBuilder("Del Mal", 3)
				.hasSeasideView(true)
				.includingBreakfast(true)
				.bedType("King")
				.floorLevel(1)
				.smokingRoom(false)
				.build(); 
		
		Booking booking2 = new Booking.BookingBuilder("Intercontinental", 2)
				.build(); 
		
		Booking booking3 = new Booking.BookingBuilder("NovumByTheSea", 4)
				.hasSeasideView(true)
				.bedType("Quuen + 2 Single")
				.smokingRoom(false)
				.build(); 
		
		Booking booking4 = new Booking.BookingBuilder("Cas Pesco", 1)
				.build(); 
	
		
		System.out.println(booking1.toString()); 
		System.out.println(booking2.toString()); 
		System.out.println(booking3.toString()); 
		System.out.println(booking4.toString()); 
		
	}

}
