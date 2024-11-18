//artist creates a profile and uploads artwork

import java.util.ArrayList;

//(subclass)
public class Artist extends Person {
	
	//artist attributes
	private String location;
	private ArrayList<Artwork> artworks;
	
	//constructor
		public Artist(String name, String location, int age) {
			super(name, age); //calls from person
			this.location = location;
			this.artworks = new ArrayList<>();
		}
	
	//getLocation
	public String getLocation() {
		return location;
	}
	//setLocation
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	// Override displayProfile to include artist-specific details
    public void displayProfile() {
        super.displayProfile();  // Call the parent (Person) method
        System.out.println("Location: " + location);
    }
	
    //Uploading artwork
	public void uploadArtwork(String title, String size, double price) {
        Artwork artwork = new Artwork(title, this, size, price); // Create Artwork object
        artwork.setAvailable(true);  // Set availability
        artworks.add(artwork);  // Add artwork to the ArrayList
    }
	
	// Get the ArrayList of artwork
    public ArrayList<Artwork> getArtworks() {
        return artworks;  // Return the ArrayList of artwork
    }
	
	
}
