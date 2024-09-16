package Coding_playground.E3Classes;

public class ExecutionFile {
    public static void main(String[] args) {
        
        Product soySauce = new Product(
        "Sauce",
        "Soy Sauce",
        50,
        24.99);

        Product hoisinSauce = new Product(
        "Sauce",
        "Hoisin Sauce",
        30,
        50.00);

        Shelf shelf1 = new Shelf(soySauce, hoisinSauce);

        System.out.println("Shelf info first pass: ---");
        shelf1.printShelfDetails();

        System.out.println("Price of Hoisin sauce went up today. By 5.3");
        hoisinSauce.price += 5.3;
        shelf1.printShelfDetails();

        Product chiliSauce = new Product(
        "Sauce",
        "Chili Sauce",
        35,
        20.00
        );

        Product darkSoySauce = soySauce;

        System.out.println("This is product ref: " + soySauce.productName + soySauce );
        System.out.println("This is product ref: " + hoisinSauce.productName + hoisinSauce );
        System.out.println("This is product ref: " + chiliSauce.productName + chiliSauce );
        System.out.println("This is product ref: " + darkSoySauce.productName + darkSoySauce );

    }
}
