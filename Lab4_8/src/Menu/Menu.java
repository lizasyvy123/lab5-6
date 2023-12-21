package Menu;

import Bouquet.Bouquet;
import Flower.*;
import Accessory.*;
import PatternCommand.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();

        Flower rose = new Rose("Rose", 11, 20, 3);
        Flower lily = new Lily("Lily", 12, 18, 2);
        Flower toffee = new Toffee("Toffee", 9, 13, 1);
        Flower violet = new Violet("Violet", 14, 20, 2);
        Flower chamomile = new Chamomile("Chamomile", 7, 10, 1);

        Accessory decorativePin = new DecorativePin("Decorative Pin", 14);
        Accessory gemstoneAccent = new GemstoneAccent("Gemstone Accent", 15);
        Accessory ribbon = new Ribbon("Ribbon", 12);
        Accessory wrappingPaper = new WrappingPaper("WrappingPaper", 16);

        Map<Integer, Command> commands = new HashMap<>();
        commands.put(1, new addFlowerToBouquet(bouquet, rose));
        commands.put(2, new addFlowerToBouquet(bouquet, lily));
        commands.put(3, new addFlowerToBouquet(bouquet, toffee));
        commands.put(4, new addFlowerToBouquet(bouquet, violet));
        commands.put(5, new addFlowerToBouquet(bouquet, chamomile));
        commands.put(6, new addAccessoryToBouquet(bouquet, decorativePin));
        commands.put(7, new addAccessoryToBouquet(bouquet, gemstoneAccent));
        commands.put(8, new addAccessoryToBouquet(bouquet, ribbon));
        commands.put(9, new addAccessoryToBouquet(bouquet, wrappingPaper));
        commands.put(10, new calculateCostBouquet(bouquet));
        commands.put(11, new sortFlowerByFreshLevel(bouquet));
        commands.put(12, new findFlowersInRange(bouquet));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (commands.containsKey(choice)) {
                commands.get(choice).execute();
            }else if (choice==13) {
                System.out.println(bouquet);
            }

            else if (choice != 0) {
                System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 0);

        System.out.println("Exiting the program.");
    }

    private static void printMenu() {
        System.out.println('\n'+"Menu:");
        System.out.println("1. Add Rose to Bouquet");
        System.out.println("2. Add Lily to Bouquet");
        System.out.println("3. Add Toffee to Bouquet");
        System.out.println("4. Add Violet to Bouquet");
        System.out.println("5. Add Chamomile to Bouquet");
        System.out.println("6. Add Decorative Pin to Bouquet");
        System.out.println("7. Add Gemstone Accent to Bouquet");
        System.out.println("8. Add Ribbon to Bouquet");
        System.out.println("9. Add Wrapping Paper to Bouquet");
        System.out.println("10. Calculate Bouquet Cost");
        System.out.println("11. Sort Flowers by Fresh Level");
        System.out.println("12. Find Flowers in Range");
        System.out.println("13. Show Bouquet");
        System.out.println("0. Exit"+'\n');
    }
}