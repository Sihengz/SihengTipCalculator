import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator");
        System.out.print("How many people are in your group:");
        int people = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage (1-100)");
        int tipPercent = scan.nextInt();
        scan.nextLine();

        double totalCost = 0;
        double currentItemCost = 0;
        while (currentItemCost != -1.0) {
            System.out.print("Enter a cost in  dollars and cents, e.g. 12.50 (-1 to end)");
            currentItemCost = scan.nextDouble();
            if (currentItemCost != -1.0) {
                totalCost += currentItemCost;
            }
        }
        System.out.println("____________________________");
        System.out.println("Total bill before tip: $" + totalCost);
        System.out.println("Total percentage: " + tipPercent + "%");
        double tip = (tipPercent / 100.0) * totalCost;
        System.out.println("Total tip: $" + (tip));
        double finalBill = totalCost + tip;
        System.out.println("Total bill with tip: $" + finalBill);
        double perPersonCost = totalCost / people;


    }
}
