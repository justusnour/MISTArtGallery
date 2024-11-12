
public class Artwork {

	public String title;
	public String artist;
	public String price;
	public boolean inStock;
	
	//getters + setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return inStock;
	}
	public void setAvailable(boolean inStock) {
		this.inStock = inStock;
	}
	
	
	
}
