import java.util.Scanner;
public class Range {
    public static void main (String args[]){
        Scanner ilagan = new Scanner(System.in);
        
        double score;

        System.out.print("Enter the score over 100: ");
        score = ilagan.nextDouble();

        if (score>100)          System.out.println("Error");

        else if (score>=98)          System.out.println("with Highest Honors");
        else if (score>=95)     System.out.println("with High Honors");
        else if (score>=88)     System.out.println("with Honors");
        else                    System.out.println("Invalid Input");

        if (score<74)           System.out.println("Failed");
        else if (score>=75)     System.out.println("Passed");

        ilagan.close();
    }
}