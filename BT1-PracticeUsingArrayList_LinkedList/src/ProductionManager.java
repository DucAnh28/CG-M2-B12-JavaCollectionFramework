import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductionManager extends Product{
    ArrayList<Product> products = new ArrayList<>();

    public ProductionManager() {
    }

    public void addProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = input.nextLine();
        System.out.println("Enter Price");
        double price = input.nextDouble();
        Product product1 = new Product(Product.id,name,price);
        Product.id++;
        return product1;
    }

    public void fixProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Id product");
        int id = input.nextInt();
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()){
                System.out.println("Enter Name");
                products.get(i).setName(input.nextLine());
                System.out.println("Enter Price");
                products.get(i).setPrice(input.nextDouble());
            }
        }
        System.out.println(products);
    }

    public void deleteProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Id product");
        int id = input.nextInt();

    }
}
