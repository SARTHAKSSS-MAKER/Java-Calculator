import java.util.Scanner; 

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new
        Scanner(System.in);

        System.out.println("====JAVA CALCULATOR====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divison");
        System.out.println("Enter your choice:");

        int choice = input.nextInt();

        System.out.print("Enter First Number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter Second Number: ");
        double num2 = input.nextDouble();

        switch(choice) {
            case 1:
                System.out.println(" Addition:" + (num1+num2) );
                break;

                case 2:
                    System.out.println("Subtration:" + (num1-num2));
                    break;

                    case 3:
                        System.out.println("Multiplication:" + (num1*num2));
                        break;

                        case 4:
                            System.out.println("Divison:" + (num1/num2));
                            break;

                            default:
                                System.out.println("Invalid Choice");

        }

    

        input.close();

    }  
}   
