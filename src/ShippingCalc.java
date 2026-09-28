import java.util.Scanner;
public class ShippingCalc{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double shippingCost = 0;
        double totalPrice = 0;
        String trash = "";

        // Output "Enter the price of the item:"
        // Input itemPrice
        // If itemPrice >= 100
        //     shippingCost = 0
        // Else
        //     shippingCost = itemPrice * 0.02
        // End If
        // totalPrice = itemPrice + shippingCost
        // Output shippingCost
        // Output totalPrice

        System.out.print("Enter the price of the item: ");
        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine(); // clear the input buffer
            if (itemPrice >= 100) {
                shippingCost = 0;
            } else {
                shippingCost = itemPrice * 0.02;
            }
            totalPrice = itemPrice + shippingCost;
            System.out.printf("Shipping cost: $%.2f%n", shippingCost);
            System.out.printf("Total price: $%.2f%n", totalPrice);
        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid price: " + trash);
            System.out.println("Run the program again and enter a valid price.");
        }
    }
}