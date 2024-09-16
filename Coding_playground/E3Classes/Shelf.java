package Coding_playground.E3Classes;

public class Shelf {
    Product product1;
    Product product2;

    public Shelf(Product product1, Product product2){
        this.product1 = product1;
        this.product2 = product2;
    }

    public void printShelfDetails() {
        System.out.println("Product 1 info");
        product1.printInfo();
        
        System.out.println("Product 2 info");
        product2.printInfo();
    }
}
