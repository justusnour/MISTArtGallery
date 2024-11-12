
public class Artwork {

	private String title;
    private String artist;
    private double price;
    private boolean inStock;
    private String paintingsize; // small, medium, or large
    private int paintingID; // ID for the painting
    
    private static final int SMALL_PRICE = 1000;
    private static final int MED_PRICE = 5000;
    private static final int LARGE_PRICE = 10000;
    
	public Artwork(String title, String artist, double price, String paintingsize, int paintingID) {
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.paintingsize = paintingsize;
		this.paintingID = paintingID;
	}
	
	
	//getters and setters
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		
	}
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	public String getPaintingsize() {
		return paintingsize;
	}
	public void setPaintingsize(String paintingsize) {
		this.paintingsize = paintingsize;
	}
		
	
	
}
	
