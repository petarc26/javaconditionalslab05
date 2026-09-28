import java.util.Scanner;
public class AgeChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = 0;
        String trash = "";

        // Output "Enter your age:"
        // Input age
        // If age >= 21
        //     Output "You get a wrist band."
        // End If

        System.out.print("Enter your age: ");
        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine(); // clear the input buffer
            if (age >= 21) {
                System.out.println("You get a wrist band.");
            }
        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid age: " + trash);
            System.out.println("Run the program again and enter a valid age.");
        }
    }
}
