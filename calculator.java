import java.util.*;

public class calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("A : For Addition");
        System.out.println("B : For Subtraction");
        System.out.println("C : For Multiplication");
        System.out.println("D : For Division");

        System.out.print("Enter the option: ");
        char ch = sc.next().charAt(0);

        switch(ch)
        {
            case 'A':
            case 'a':
                System.out.println("Addition = " + (n1 + n2));
                break;

            case 'B':
            case 'b':
                System.out.println("Subtraction = " + (n1 - n2));
                break;

            case 'C':
            case 'c':
                System.out.println("Multiplication = " + (n1 * n2));
                break;

            case 'D':
            case 'd':
                if(n2 != 0)
                {
                    System.out.println("Division = " + (n1 / n2));
                }
                else
                {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Error: Invalid Option");
        }

        sc.close();
    }
}