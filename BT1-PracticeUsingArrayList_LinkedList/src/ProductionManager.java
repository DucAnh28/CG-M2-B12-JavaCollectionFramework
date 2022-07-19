import java.util.ArrayList;
import java.util.Scanner;

public class ProductionManager {
    public static ArrayList<Product> products = new ArrayList<>();

    static {
        Product product1 = new Product(1, "Laptop", 50);
        Product product2 = new Product(2, "Desktop", 40);
        Product product3 = new Product(3, "Lamp", 10);
        products.add(product1);
        products.add(product2);
        products.add(product3);
    }

    public static void main(String[] args) {
//        displayProduct(products);
//        findByName(products);
//        fixProduct(products);
//        System.out.println(products);
        sortProductByPrice(products);
        System.out.println(products);
        sortProductByPriceDecrease(products);
        System.out.println(products);
    }

    //  Thêm sản phẩm:
    public static void addProduct(ArrayList<Product> arrayList) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = input.nextInt();
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        System.out.print("Enter Price: ");
        double price = input1.nextDouble();
        Product product1 = new Product(id, name, price);
        arrayList.add(product1);
    }

    //    Sửa sản phẩm:
    public static void fixProduct(ArrayList<Product> arrayList) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Id product");
        int id = input1.nextInt();
        System.out.print("Enter name of product you want to change: ");
        arrayList.get(id - 1).setName(input.nextLine());
        System.out.print("Enter price of the product you want to change:");
        arrayList.get(id - 1).setPrice(input1.nextDouble());
    }

    //    Hiển thị sản phẩm:
    public static void displayProduct(ArrayList<Product> arrayList) {
        int count = 1;
        for (Product x : arrayList) {
            System.out.println(count + ". " + x);
            count++;
        }
    }

    //    Tìm sản phẩm theo tên:
    public static void findByName(ArrayList<Product> arrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        boolean check = false;
        Product temp = null;
        for (Product e : arrayList
        ) {
            if (name.equals(e.getName())) {
                check = true;
                temp = e;
            }
        }
        if (check == true) {
            System.out.println("Product you want to check: " + temp);
        } else {
            System.out.println("There is no product you want to find");
        }
    }

    //    Sắp xếp tăng dần theo giá:
    public static ArrayList<Product> sortProductByPrice(ArrayList<Product> arrayList) {
        arrayList.sort(((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice())));
        return arrayList;
    }

    //    Sắp xếp giảm dần theo giá:
    public static ArrayList<Product> sortProductByPriceDecrease(ArrayList<Product> arrayList) {
        arrayList.sort(((o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice())));
        return arrayList;
    }

    public static void deleteProduct(ArrayList<Product> arrayList) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Id product");
        int id = input.nextInt();
    }
}