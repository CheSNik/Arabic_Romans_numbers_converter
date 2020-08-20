import java.util.Scanner;
/**
 * Assignment 2 lab 2 p5.9
 * @author Sergei Chekhonin
 * This program converts Arabic numbers to Roman
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter Arabic number to convert (less then 3999) >");
        Scanner scanner = new Scanner(System.in);
        int arabicNumber = Integer.parseInt(scanner.nextLine());
        RomanNumbers romanNumber = new RomanNumbers(arabicNumber);

        System.out.println("Convertion completed: "+arabicNumber+" --> "+ romanNumber.convert());
    }
}
