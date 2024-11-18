//Stores artwork information

import java.util.HashMap;

public class Artwork {

	//artwork attributes
	private String title;
	private Artist artist;
	private double price;
	private boolean isAvailable;
	private int ID;
	private String size; //small, medium, large
	private static HashMap<Integer, Artwork> artworkIDs = new HashMap<Integer, Artwork>();
	private static int nextID = 1;
	
	//constructor
	public Artwork(String title, Artist artist, String size, double price) {
		this.title = title;
		this.artist = artist;
		this.size = size;
		this.price = price;
		this.isAvailable = true;
		this.ID = generateID();
		artworkIDs.put(ID, this);
	}
	
	public static Artwork getArtworkByID(int ID) {
        return artworkIDs.get(ID);
    }
	
	private int generateID() {
        return nextID++;  // Return the current value of nextID and increment it
    }
	
	//getTitle
	public String getTitle() {
		return title;
	}
	//setTitle
	public void setTitle(String title) {
		this.title = title;
	}
	
	//getArtist
	public Artist getArtist() {
		return artist;
	}
	//setArtist
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	
	//getPrice
	public double getPrice() {
		return price;
	}
	//setPrice
	public void setPrice(double price) {
		this.price = price;
	}
	
	//isAvailable
	public boolean isAvailable() {
		return isAvailable;
	}
	//setAvilable
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	//getID
	public int getID() {
		return ID;
	}

	//setID
	public void setID(int ID) {
		this.ID = ID;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	
}
