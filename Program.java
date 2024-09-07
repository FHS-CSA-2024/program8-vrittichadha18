//import stuff here
import java.util.Scanner;

//Your code here
class Program8 {
    public static void main(String[]args){
        Scanner myScanner = new Scanner (System.in);
        
        int number1;
        System.out.println("Enter number 1: ");
        number1 = myScanner.nextInt();
        
        System.out.println();
        
        int number2;
        System.out.println("Enter number 2: ");
        number2 = myScanner.nextInt();
        
        int sum = Math.addExact(number1, number2);
        int difference = Math.subtractExact(number1, number2);
        int product = Math.multiplyExact(number1, number2);
        double average = (sum)/2.0;
        int distance = Math.abs(difference);
        int maximum = ((number1 + number2) + distance)/2 ;
        int minimum = ((number1 + number2) - distance)/2;
        
        System.out.println();
        
        System.out.println("Original numbers are " + number1 + " and " + number2);
        System.out.println();
        System.out.println("Sum = " + sum);
        System.out.println();
        System.out.println("Difference = " + difference);
        System.out.println();
        System.out.println("Product = " + product);
        System.out.println();
        System.out.printf("Average = %.1f%n", average);
        System.out.println();
        System.out.println("Absolute Value = " + distance);
        System.out.println();
        System.out.println("Maximum = " + maximum);
        System.out.println();
        System.out.println("Minimum = " + minimum);
    }
}
//Paste console output below:
/*
Enter number 1: 
13

Enter number 2: 
20

Original numbers are 13 and 20

Sum = 33

Difference = -7

Product = 260

Average = 16.5

Absolute Value = 7

Maximum = 20

Minimum = 13
*/
