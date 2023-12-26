import java.util.Scanner;

public class AdventureGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introduction
        System.out.println("Welcome to the Adventure Game!");
        System.out.println("You find yourself in a mysterious place...");

        // Game loop
        boolean gameOver = false;
        while (!gameOver) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Explore the surroundings");
            System.out.println("2. Open the door");
            System.out.println("3. Quit the game");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the input buffer

            switch (choice) {
                case 1:
                    System.out.println("You explore the surroundings...");
                    // Implement your logic for exploring here
                    break;
                case 2:
                    System.out.println("You open the door...");
                    // Implement your logic for opening the door here
                    break;
                case 3:
                    System.out.println("Thanks for playing! Goodbye!");
                    gameOver = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
