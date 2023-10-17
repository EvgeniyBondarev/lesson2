import java.util.Scanner;
/*
 */



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Product name: ");
        String productName = scanner.nextLine();
        System.out.print("Quantity of products: ");
        int quantityProducts = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Your phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Your address: ");
        String address = scanner.nextLine();

        System.out.printf("Your order is accepted. " +
                "The product %s in quantity %d will arrive to you in the near future. " +
                "We will deliver the goods to the address: %s. Your contact number: %s."
                , productName, quantityProducts, address, phoneNumber);

    }
}