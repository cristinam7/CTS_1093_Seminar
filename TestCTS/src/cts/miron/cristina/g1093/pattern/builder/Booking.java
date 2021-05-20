package cts.miron.cristina.g1093.pattern.builder;

public class Booking {
	
	private final String hotelName; 
	private final String bedType; 
	private final int noPersonsInRoom; 
	private final int floorLevel; 
	private final boolean seasideView; 
	private final boolean includedBreakfast; 
	private final boolean smokingRoom;

	
	private Booking(BookingBuilder builder) {
		super();
		this.hotelName = builder.hotelName;
		this.includedBreakfast = builder.includedBreakfast;
		this.noPersonsInRoom = builder.noPersonsInRoom;
		this.bedType = builder.bedType;
		this.seasideView = builder.seasideView;
		this.floorLevel = builder.floorLevel;
		this.smokingRoom = builder.smokingRoom;
	}


	public String getHotelName() {
		return hotelName;
	}


	public boolean isIncludedBreakfast() {
		return includedBreakfast;
	}


	public int getNoPersonsInRoom() {
		return noPersonsInRoom;
	}


	public String getBedType() {
		return bedType;
	}


	public boolean isSeasideView() {
		return seasideView;
	}


	public int getFloorLevel() {
		return floorLevel;
	}


	public boolean isSmokingRoom() {
		return smokingRoom;
	} 
	
	@Override
	public String toString() {
		return "Booking at hotel " + this.hotelName + " for " + this.noPersonsInRoom + " people with the facilities: "
				+ "\n Seaside view: " + this.seasideView 
				+ "\n Smoking room: " + this.smokingRoom 
				+ "\n Breakfast included: " + this.includedBreakfast 
				+ "\n Bed type: " + this.bedType 
				+ "\n Floor level: " + this.floorLevel;
	}

	public static class BookingBuilder { 
			
		//only the first 2 fields are mandatory for any booking
		private final String hotelName;
		private final int noPersonsInRoom;
		private  boolean includedBreakfast; 	 
		private  String bedType; 
		private  boolean seasideView; 
		private  int floorLevel; 
		private  boolean smokingRoom;
		
		
		public BookingBuilder(String hotelName, int noPersonsInRoom) {
			super();
			this.hotelName = hotelName;
			this.noPersonsInRoom = noPersonsInRoom;
		}
		
		public BookingBuilder includingBreakfast(boolean withBreakfastIncluded) { 
			this.includedBreakfast = withBreakfastIncluded; 
			return this; 
		}
		
		public BookingBuilder hasSeasideView(boolean seasideView) { 
			this.seasideView = seasideView; 
			return this; 
		}
		
		public BookingBuilder bedType(String bedType) { 
			this.bedType = bedType; 
			return this; 
		}
		
		public BookingBuilder smokingRoom(boolean smokingRoom) { 
			this.smokingRoom = smokingRoom; 
			return this; 
		}
		
		public BookingBuilder floorLevel(int floorLevel) { 
			this.floorLevel = floorLevel; 
			return this; 
		}
		
		public Booking build() { 
			Booking booking = new Booking(this);
			return booking; 
		}
		
		
	}
	
	
	

}
