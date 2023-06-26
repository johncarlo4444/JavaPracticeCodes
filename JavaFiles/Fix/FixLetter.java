import java.util.Scanner;

public class FixLetter {
    public static void main (String args[]){
        Scanner ilagan = new Scanner(System.in);
        
        String drink;

        System.out.print("Enter a drink that you want from C2, COKE, and Water: ");
        drink = ilagan.nextLine();

        if (drink.equalsIgnoreCase("C2"))           System.out.println("You chose C2: Php 15.00");
        else if (drink.equalsIgnoreCase("COKE"))    System.out.println("You chose Coke: Php 20.00");
        else if (drink.equalsIgnoreCase("Water"))   System.out.println("You chose Water: Php 10.00");
        else                                        System.out.println("Invalid Input");

        ilagan.close();
    }
}
