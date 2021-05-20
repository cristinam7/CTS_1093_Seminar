package cts.miron.cristina.g1093.pattern.flyweight;

import java.util.HashMap;

public class GalleryFactory {

	
	//String is their area and hotel from that area
	private static final HashMap<String, Hotel> hotelsMap = new HashMap<String, Hotel>(); 
	
	static { 
		hotelsMap.put("Valea Prahovei", new Hotel(new GalleryImage("valeaPrahovei.png")));
		hotelsMap.put("Mtii Bucegi", new Hotel(new GalleryImage("bucegi.png")));
	}
	
	public static Hotel getHotel(String area) { 
		
		Hotel hotel = hotelsMap.get(area);
		
		if(hotel != null) { 
			return hotel; 
		} else { 
			hotel = new Hotel(); 
			hotelsMap.put(area, hotel);
		}		
		return hotel;		
	}
	
}
