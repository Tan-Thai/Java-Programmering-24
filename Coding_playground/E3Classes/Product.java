package Coding_playground.E3Classes;

public class Product {
    String productCategory;
    String productName;
    int stock;
    double price;
    
    
    public Product(String inCategory, String inName, int inStock, double inPrice) {
        productCategory = inCategory;
        productName = inName;
        stock = inStock;
        price = inPrice;
    }
    
    public Product() {
        this(
            "Placeholder Category",
            "Placeholder name",
            0, 
            29.99);
            
        }   
    }