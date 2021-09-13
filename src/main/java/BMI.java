/*
 *  UCF COP3330 Fall 2021 Exercise 19 Solution
 *  Copyright 2021 Maxwell Graeser
 */

import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your weight, in pounds? ");
        float weight;
        try {
            weight = Float.parseFloat(scan.nextLine());
        }
        catch (NumberFormatException ex) {
            System.out.println("Not a valid input, please enter numerics");
            return;
        }

        System.out.print("What is your height, in inches? ");
        float height;
        try {
            height = Float.parseFloat(scan.nextLine());
        }
        catch (NumberFormatException ex) {
            System.out.println("Not a valid input, please enter numerics");
            return;
        }

        String output;
        double bmi = (weight / (height * height)) * 703;
        if (bmi >= 18.5) {
            if (bmi <= 25)
                output = String.format("Your BMI is %.1f\nYou are within the ideal weight range.", bmi);
            else
                output = String.format("Your BMI is %.1f\nYou are overweight, you should see a doctor.", bmi);
        }
        else
            output = String.format("Your BMI is %.1f\nYou are underweight, you should see a doctor.", bmi);

        System.out.println(output);
    }
}