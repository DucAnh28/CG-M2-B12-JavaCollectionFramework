import java.util.Scanner;

public class ProductionManager {
    public static void main(String[] args) {

    }

    public static void addProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = input.nextLine();
        System.out.println("Enter Price");
        double price = input.nextDouble();
        Product product1 = new Product(Product.count,name,price);
        Product.count++;
    }

    public static
}
