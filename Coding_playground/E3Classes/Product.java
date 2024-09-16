package Coding_playground.E3Classes;
import java.text.MessageFormat;

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
                10.00);
    }

    public void printInfo() {
        System.out.println(MessageFormat.format(
        "The products name is {0} and it belongs in the {1} category.\nWe currently have {2} in stock and each costs {3}\n",
        this.productName, this.productCategory, this.stock, this.price));
    }
}