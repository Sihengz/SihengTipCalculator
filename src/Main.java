import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Learned how to round from https://jenkov.com/tutorials/java-internationalization/decimalformat.html
        String pattern = "###,###.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        System.out.println("Welcome to the tip calculator");
        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage (1-100): ");
        int tipPercent = scan.nextInt();
        scan.nextLine();

        ArrayList<String> items = new ArrayList<String>();
        String item;
        double totalCost = 0;
        double currentItemCost = 0;
        while (currentItemCost != -1.0) {
            System.out.print("Enter a cost in  dollars and cents, e.g. 12.50 (-1 to end): ");
            currentItemCost = scan.nextDouble();
            if (currentItemCost != -1.0) {
                totalCost += currentItemCost;
            }
            System.out.print("Enter the item; ");
            item = scan.nextLine();
            items.add(item);

        }
        System.out.println("____________________________");
        System.out.println("Total bill before tip: $" + totalCost);
        System.out.println("Total percentage: " + tipPercent + "%");
        double tip = (tipPercent / 100.0) * totalCost;
        System.out.println("Total tip: $" + (decimalFormat.format(tip)));
        double finalBill = totalCost + tip;
        System.out.println("Total bill with tip: $" + decimalFormat.format(finalBill));
        double perPersonCost = totalCost / people;
        System.out.println("Per person cost before tip: $" + decimalFormat.format(perPersonCost));
        double tipPerPerson = tip / people;
        System.out.println("Tip per person: $" + decimalFormat.format(tipPerPerson));
        perPersonCost += tipPerPerson;
        System.out.println("Total cost per person: $" + decimalFormat.format(perPersonCost));
        System.out.println("____________________________");
        System.out.println("Items ordered: ");

        System.out.println(items);

    }
}
