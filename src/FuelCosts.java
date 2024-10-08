import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double gallons = 0;
        double fuelEffic = 0;
        double pricePerGal = 0;

        do{
            System.out.print("Enter the number of gallons of gas in your tank: ");
            gallons = input.nextDouble();
            if (gallons <= 0) {
                System.out.println("Please enter a positive number: ");
            }
        }while (gallons <= 0);

        do{
            System.out.print("Enter the efficiency in miles per gallon: ");
            fuelEffic = input.nextDouble();
            if (fuelEffic <= 0) {
                System.out.println("Please enter a positive number: ");
            }

            }while (fuelEffic <= 0);

            do{
                System.out.print("Enter the price of gas per gallon: ");
                pricePerGal = input.nextDouble();
                if (pricePerGal <= 0) {
                    System.out.println("Please enter a positive value");
                }
            }while (pricePerGal <= 0);

            double cost100Miles = (100 / fuelEffic) * pricePerGal;
            double fullTankDistance = gallons * fuelEffic;

            System.out.printf("The cost for driving 100 miles is: $%.2f%n", cost100Miles);
            System.out.printf("The car can go %.2f miles with a full tank of gas.%n", fullTankDistance);

    }
}
