/**
 * Problem Set 2.
 *
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         *
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */

         System.out.print("\nEnter your first name: ");
         String firstName = in.nextLine();
         System.out.print("Enter your last name: ");
         String lastName = in.nextLine();
         System.out.print("Enter your grade: ");
         int grade = in.nextInt();
         System.out.print("Enter your age: ");
         int age = in.nextInt();
         in.nextLine();
         System.out.print("Enter your hometown: ");
         String hometown = in.nextLine();

         System.out.println("\nNAME     : " + firstName + " " + lastName);
         System.out.println("GRADE    : " + grade);
         System.out.println("AGE      : " + age);
         System.out.println("HOMETOWN : " + hometown + "\n");

        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

         final double DOLLAR = 1.00;
         final double QUARTER = .25;
         final double DIME = .10;
         final double NICKEL = .05;
         final double PENNY = .01;

         System.out.print("Enter a dollar amount: ");
         double dollarAmount = in.nextDouble();
         System.out.println("");
         double dollarFinal = Math.floor(dollarAmount/DOLLAR); /*Finds the amount of dollars needed by diving the
           dollarAmount by the amount of a dollar(the constant)*/
         dollarAmount = dollarAmount % DOLLAR; /*This is needed so the next coin amount can be calculated by the
           remainder*/
         double quarterAmount = Math.floor(dollarAmount/QUARTER);
         dollarAmount = dollarAmount % QUARTER;
         double dimeAmount = Math.floor(dollarAmount/DIME);
         dollarAmount = dollarAmount % DIME;
         double nickelAmount = Math.floor(dollarAmount/NICKEL);
         dollarAmount = dollarAmount % NICKEL;
         double pennyAmount = dollarAmount/PENNY;
         dollarAmount = dollarAmount % PENNY;

         System.out.printf("DOLLARS  : %.0f\n", dollarFinal);
         System.out.printf("QUARTERS : %.0f\n", quarterAmount);
         System.out.printf("DIMES    : %.0f\n", dimeAmount);
         System.out.printf("NICKELS  : %.0f\n", nickelAmount);
         System.out.printf("PENNIES  : %.0f\n", pennyAmount);

        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */

         final double TEN = 10.00;
         final double FIVE = 5.00;

         System.out.print("\nEnter a dollar amount: ");
         double dollarAmount2 = in.nextDouble();
         System.out.println("");

         double tenAmount = Math.floor(dollarAmount2/TEN);
         dollarAmount2 = dollarAmount2%TEN;
         double fiveAmount = Math.floor(dollarAmount2/FIVE);
         dollarAmount2 = dollarAmount2%FIVE;
         double dollarFinal2 = Math.floor(dollarAmount2/DOLLAR);
         dollarAmount2 = dollarAmount2%DOLLAR;
         double bills = tenAmount+fiveAmount+dollarFinal2;

         double quarterAmount2 = Math.floor(dollarAmount2/QUARTER);
         dollarAmount2 = dollarAmount2 % QUARTER;
         double dimeAmount2 = Math.floor(dollarAmount2/DIME);
         dollarAmount2 = dollarAmount2 % DIME;
         double nickelAmount2 = Math.floor(dollarAmount2/NICKEL);
         dollarAmount2 = dollarAmount2 % NICKEL;
         double pennyAmount2 = dollarAmount2/PENNY;
         dollarAmount2 = dollarAmount2 % PENNY;
         double coins = quarterAmount2+dimeAmount2+nickelAmount2+pennyAmount2; /*Using the same code to calculate the
           number of coins and bills but at the end add them together so there is a single number for each*/

         System.out.printf("BILLS : %.0f\n", bills);
         System.out.printf("COINS : %.0f\n", coins);

        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */

         final double INCHES_IN_MILE = 63360;
         final double INCHES_IN_YARD = 36;
         final double INCHES_IN_FOOT = 12;

         System.out.print("\nEnter a number of inches: ");
         double inches = in.nextDouble();
         System.out.println("");

         double mileAmount = Math.floor(inches/INCHES_IN_MILE);
         inches = inches % INCHES_IN_MILE;
         double yardAmount = Math.floor(inches/INCHES_IN_YARD);
         inches = inches % INCHES_IN_YARD;
         double feetAmount = Math.floor(inches/INCHES_IN_FOOT);
         inches = inches % INCHES_IN_FOOT;

         System.out.printf("MILES  : %.0f\n", mileAmount);
         System.out.printf("YARDS  : %.0f\n", yardAmount);
         System.out.printf("FEET   : %.0f\n", feetAmount);
         System.out.printf("INCHES : %.0f\n", inches);

        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */

         final double CENTI_IN_KILO = 100000;
         final double CENTI_IN_METER = 100;

         System.out.print("\nEnter a number of centimeters: ");
         double centimeters = in.nextDouble();
         System.out.println("");

         double kilometer = Math.floor(centimeters/CENTI_IN_KILO);
         centimeters = centimeters % CENTI_IN_KILO; //Uses the same format used in the other exercises
         double meter = Math.floor(centimeters/CENTI_IN_METER);
         centimeters = centimeters % CENTI_IN_METER;


         System.out.printf("KILOMETERS  : %.0f\n", kilometer);
         System.out.printf("METERS      : %.0f\n", meter);
         System.out.printf("CENTIMETERS : %.0f\n", centimeters);

        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */

         System.out.print("\nEnter a diameter: ");
         double diameter = in.nextDouble();
         System.out.println("");
         double radius = diameter/2;
         double area = Math.PI*Math.pow(radius, 2);
         double circumference = 2*Math.PI*radius;
         System.out.printf("AREA          : %.2f\n", area);
         System.out.printf("CIRCUMFERENCE : %.2f\n", circumference);

        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */

         System.out.print("\nEnter a length: ");
         double length = in.nextDouble();
         System.out.print("Enter a width: ");
         double width = in.nextDouble();
         System.out.println("");

         double area2 = length*width;
         double perimeter2 = (length*2) + (width*2);
         double diagonal = Math.hypot(length, width);

         System.out.printf("AREA      : %.2f\n", area2);
         System.out.printf("PERIMETER : %.2f\n", perimeter2);
         System.out.printf("DIAGONAL  : %.2f\n", diagonal);

        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */

         System.out.print("\nEnter a side length: ");
         double length2 = in.nextDouble();
         System.out.println("");

         double areaHexagon = ((3*Math.sqrt(3))/2)*Math.pow(length2, 2);
         double perimeterHexagon = 6*length2;

         System.out.printf("AREA      : %.2f\n", areaHexagon);
         System.out.printf("PERIMETER : %.2f\n", perimeterHexagon);
         in.nextLine();

        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */

         System.out.print("\nEnter a String: ");
         String str = in.nextLine();
         System.out.println("");
         String firstHalf = str.substring(str.length() / 2, str.length());
         String secondHalf = str.substring(0, str.length() / 2);
         System.out.print(firstHalf+secondHalf+"\n");


        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */

         System.out.print("\nEnter your first name: ");
         String firstNameAgain = in.nextLine();
         System.out.print("Enter your middle name: ");
         String middleName = in.nextLine();
         System.out.print("Enter your last name: ");
         String lastNameAgain = in.nextLine();

         char firstLetter = firstNameAgain.charAt(0);
         char middleLetter = middleName.charAt(0);
         char lastLetter = lastNameAgain.charAt(0);
         System.out.println("\n"+String.valueOf(firstLetter)+String.valueOf(middleLetter)+String.valueOf(lastLetter));
         /*Adding the characters together would return numbers instead of the actual characters so I converted the
          characters into strings*/
    }
}
