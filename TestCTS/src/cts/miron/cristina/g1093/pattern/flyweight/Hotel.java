package cts.miron.cristina.g1093.pattern.flyweight;

public class Hotel {

	GalleryImage gallery;

	public Hotel() { 
		
	}
	
	public Hotel(GalleryImage gallery) {
		super();
		this.gallery = gallery;
	}

	public GalleryImage getGallery() {
		return gallery;
	}

	public void setGallery(GalleryImage gallery) {
		this.gallery = gallery;
	} 

}
