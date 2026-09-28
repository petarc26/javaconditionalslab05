import java.util.Scanner;
public class chooseParty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String party = "";

        // Output menu for D, R, or I
        // Input party
        // If party equals "D"
        //     Output "You get a Democratic Donkey."
        // Else If party equals "R"
        //     Output "You get a Republican Elephant."
        // Else If party equals "I"
        //     Output "You get an Independent Person."
        // Else
        //     Output "You chose Other."
        // End If

        System.out.println("Choose your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your choice: ");
        party = in.nextLine();
        if (party.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        }
        else if (party.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        }
        else if (party.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person.");
        }
        else {
            System.out.println("You chose Other.");
        }
    }
}
