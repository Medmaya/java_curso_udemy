package introducaopoo.construtores.application;

import introducaopoo.construtores.application.entities.Product2;
import introducaopoo.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Product2 product = new Product2(name, price, quantity);

        System.out.println();
        System.out.println("Product data:" + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());

        System.out.println();
        System.out.println("Update data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        product.removeProducts(sc.nextInt());

        System.out.println();
        System.out.println("Update data: " + product);

        sc.close();
    }
}
