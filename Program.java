//import stuff here
import java.util.Scanner;

//Your code here
class Program8 {
    public static void main(String[]args){
        Scanner myScanner = new Scanner (System.in);
        
        int number1;
        System.out.println("Enter number 1: ");
        number1 = myScanner.nextInt();
        
        int number2;
        System.out.println("Enter number 2: ");
        number2 = myScanner.nextInt();
        
        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        double average = (number1 + number2)/2.0;
        int absoluteValue = Math.abs(difference);
        //maximum = ((num1+num2) + distance)/2;
        //minimum = ((num1+num2) - distance)/2;
        int maximum;
        int minimum;
        
        System.out.println();
        
        System.out.println("Original numbers are " + number1 + " and " + number2);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.printf("Average = %.1f%n", average);
        System.out.println("Absolute Value = " + absoluteValue);
        System.out.println("Maximum = " + maximum);
        System.out.println("Minimum = " + minimum);
    }
}
//Paste console output below:
/*


*/
