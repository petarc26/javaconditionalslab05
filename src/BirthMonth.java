import java.util.Scanner;
public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        // Output "Enter your birth month:"
        // Input birthMonth
        // If birthMonth >= 1 AND birthMonth <= 12
        //     Output "Your birth month is: " + birthMonth
        // Else
        //     Output "You entered an incorrect month value: " + birthMonth
        // End If

        System.out.print("Enter your birth month (1-12): ");
        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine(); // clear the input buffer
            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }
        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid value: " + trash);
            System.out.println("Run the program again and enter a valid integer.");
        }
    }
}
