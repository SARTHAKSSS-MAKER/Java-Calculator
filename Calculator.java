import java.util.Scanner; 

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new
        Scanner(System.in);

        System.out.print("Enter First Number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter Second Number: ");
        double num2 = input.nextDouble();

        double addition = num1 + num2;
        System.out.println("Addition: " + addition);

        double subtraction = num1 - num2;
        System.out.println("Subtraction: " + subtraction);

        double multiplication = num1 * num2;
        System.out.println("Multiplication: " + multiplication);

        double division = num1 / num2;
        System.out.println("Division: " + division);

        input.close();

    }  
}   
