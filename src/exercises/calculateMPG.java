package exercises;

import java.util.Scanner;

public class calculateMPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles driven: ");
        double milesDriven = input.nextDouble();
        System.out.println("Enter amount of gas used (in gallons): ");
        double gasUsed = input.nextDouble();
        double milesPerGallon = gasUsed/milesDriven;
        System.out.println("The miles per gallon are: " + milesPerGallon);
    }
}

