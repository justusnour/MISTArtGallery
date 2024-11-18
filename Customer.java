//customer browses available art and purchases

import java.util.HashSet;
import java.util.ArrayList;

//(subclass)
public class Customer extends Person{

	//customer attributes
	private double budget;
	private HashSet<Integer> purchasedArtworks;
	
	//constructor
	public Customer(String name, int age, double budget) {
		super(name, age); //calls from Person
		this.budget = budget;
		this.purchasedArtworks = new HashSet<Integer>();
	}

	//budget getters/setters
	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	// Override displayProfile to include customer-specific details
    public void displayProfile() {
        super.displayProfile();  // Call the parent (Person) method
        System.out.println("Budget: $" + budget);
    }
	
	//browsing the artwork
	public void browseArtworks(ArrayList<Artwork> artworks) {
        System.out.println("Available artwork:");
		for (Artwork artwork : artworks) {
            if (artwork.isAvailable()) {
                System.out.println("Title: " + artwork.getTitle() + ", Price: " + artwork.getPrice());
            }
        }
    }
	
	//browsing the exclusive gallery
	public void browsePremiumArtworks(ExclusiveGallery gallery) {
        gallery.browsePremiumArtworks();
    }
	
	//purchasing artwork
	public boolean purchaseArtwork(Artwork artwork) {
        // Check if the artwork is available and if the customer has enough budget
        if (!artwork.isAvailable()) {
            System.out.println("Sorry, the artwork is no longer available.");
            return false;
        }

        if (purchasedArtworks.contains(artwork.getID())) {
            System.out.println("You have already purchased this artwork.");
            return false;
        }

        if (this.budget >= artwork.getPrice()) {
            this.budget -= artwork.getPrice();  // Deduct the price from the customer's budget
            artwork.setAvailable(false);  // Mark the artwork as unavailable
            purchasedArtworks.add(artwork.getID());  // Add the artwork ID to the purchased set
            System.out.println();
            System.out.println("Congrats! You have successfuly purchased: " + artwork.getTitle());
            return true;
        } else {
            System.out.println("Sorry, you don't have enough budget to purchase this artwork.");
            return false;
        }
    }
	
	// View purchased artwork
    public void viewPurchasedArtworks() {
        if (purchasedArtworks.isEmpty()) {
            System.out.println("You have not purchased any artworks yet.");
        } else {
            System.out.println("Your Purchased Artworks:");
            for (Integer artworkID : purchasedArtworks) {
                Artwork artwork = Artwork.getArtworkByID(artworkID);
                System.out.println("Title: " + artwork.getTitle() + ", Price: " + artwork.getPrice());
            
            }
        }
    }
}
