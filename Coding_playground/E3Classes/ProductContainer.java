package Coding_playground.E3Classes;

public class ProductContainer {

    public static void main(String[] args) {
        Product soySauce = new Product(
            "Sauce",
            "Soy Sauce",
            10,
            30.00);
        Product peanuts = new Product();

        System.out.println(soySauce.productName + "\n" + peanuts.productName);
       
    }
    
}
