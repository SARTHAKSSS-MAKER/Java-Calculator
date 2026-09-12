import java.util.Scanner; 

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new
        Scanner(System.in);

        char choice;
        do {

        System.out.println("====JAVA CALCULATOR====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divison");
        System.out.println("Enter your choice:");

        int operation = input.nextInt();

        System.out.print("Enter First Number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter Second Number: ");
        double num2 = input.nextDouble();

        switch(operation) {
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
         System.out.println("Do you want to continue? (Y/N): ");
        choice = input.next().charAt(0);
    }while (choice == 'Y' || choice == 'y');

        input.close();

    }  
}   
