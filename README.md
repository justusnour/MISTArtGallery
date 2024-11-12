# MISTArtGallery

# 1. Virtual Art Gallery Management System
<h3>Overview:</h3>
Create a system for an online art gallery where artists can display their artwork, and customers can browse and purchase pieces. 
<h2>Core Features:</h2>

* Artists: Artists can create profiles, upload art pieces, and list pricing information.

* Artworks: Each artwork can have details like title, artist, price, and availability.

* Customers: Customers can browse artwork, view detailed pages, and purchase.

* Sales & Payment: Handle transactions, sales records, and payment processing.

# End-to-End Scenarios
**Example:** Artist Uploads Artwork and Customer Makes a Purchase.

- **Objective:** An artist uploads a new artwork with details such as title, medium, price, and availability. A customer browses the gallery, selects an artwork, and proceeds with the purchase.
- **Steps:**
  **Artist Creates a Profile and Uploads Artwork:**

      *The artist creates an account (profile) and uploads new artwork.

      *The artwork is assigned a category (Painting, Sculpture, Photography).

      *The artwork's details (title, price, and availability) are stored.

  **Customer Browses Artwork:**

      *A customer views the gallery of available artwork, sorted by category.

      *The customer filters the artworks by medium and availability.

  **Customer Makes a Purchase:**

      *Once the customer selects an artwork, they add it to the cart.

      *The customer proceeds to checkout and makes a payment.

      *The system updates the availability of the artwork and records the sale.

- **Involvement of OOP Principles:**

    -**Inheritance:** Different types of artwork (e.g., Painting, Sculpture, Photography) inherit from the Artwork class.

    -**Polymorphism:** displayArtwork() behaves differently depending on the type of artwork (painting vs sculpture).

    -**Encapsulation:** Artist’s personal details, artwork pricing, and availability are encapsulated.

    -**Composition:** The Order class will contain a list of Artwork objects (has-A relationship).

    -**Collections:** We’ll use all four collections here:

    -**Arrays:** Store a fixed list of categories for the artworks.

    -**ArrayLists:** Used for storing a list of artworks uploaded by artists.

    -**HashMaps:** Used to store customers with their CustomerID as the key, and Customer as the value.

    -**HashSets:** Used to store purchased artwork by customers to ensure there are no duplicates.
# 2. Use of the Four Collections
Here’s how each collection type is used in the two scenarios:

-1. Arrays:
  -**Usage:** Store fixed lists, like predefined categories of artworks (e.g., "Painting", "Sculpture", "Photography").
    
  -**Justification:** Arrays are perfect for storing a small, fixed collection of data like predefined categories that don’t change frequently.
  
-2. ArrayLists:
  -**Usage:** Store dynamic lists of artworks, customers, or orders. Artists can upload a new artwork, and it is added to the ArrayList of artworks.
    
  -**Justification:** Since the number of artworks uploaded can vary, an ArrayList allows easy addition and removal of items.
    
-3. HashMaps:
  -**Usage:** Store data in key-value pairs, such as mapping CustomerID to Customer objects or ArtworkID to sales data.
    
  -**Justification:** HashMaps are ideal for fast lookups, such as finding a customer by their ID or tracking the number of sales for an artwork.
    
-4. HashSets:
  -**Usage:** Store unique items, such as the list of artworks that have been sold.
    
  -**Justification:** Since HashSets don’t allow duplicates, they ensure that each artwork can only appear once in the list of sold items.
    
# 3. Final Thoughts
-**Inheritance:** Painting, Sculpture, and Photography are subclasses of Artwork, allowing polymorphic behavior in methods like displayArtwork().

-**Polymorphism:** Different types of artworks implement the displayArtwork() method in their own way.

-**Encapsulation:** Personal details and artwork prices are kept private and only accessible via getter/setter methods.

-**Composition:** The Order class "has a"
