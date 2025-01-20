/* Cyrus Jayson A. Pedere
   Bscpe 1-1 Programming Logic and Design
   Module IV & V - Programming Exercise

   **** 1. Body Mass Index Program Enhancement ****
        Java LANGUAGE
 */

import java.util.Scanner;

public class bmicalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int weight, height;
        double bmi;

        System.out.println("What is your weight in pounds? ");
        weight = keyboard.nextInt();

        System.out.println("What is your height in inches? ");
        height = keyboard.nextInt();

        bmi = (double) (weight * 703) / (height * height);

        System.out.printf("Your BMI is: ", bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("Your weight is optimal.");
        } else {
            System.out.println("You are overweight.");
        }

        keyboard.close();
    }
}
