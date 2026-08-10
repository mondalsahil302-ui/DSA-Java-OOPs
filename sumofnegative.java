// Write a program to print the sum of negative numbers, 
// sum of positive even numbers and the sum of positive odd numbers from a
//  list of numbers (N) entered by the user. The list terminates when the user enters a zero.
import java.util.*;

public class sumofnegative
{
    public static void main(String[] args)
    {
        sumofnegative r = new sumofnegative();

        double sum_even = 0;
        double sum_odd = 0;
        double sum_neg = 0;

        while(true)
        {
            double n = r.display();

            if(n > 0 && n % 2 == 0)
            {
                sum_even = sum_even + n;
            }
            else if(n > 0 && n % 2 != 0)
            {
                sum_odd = sum_odd + n;
            }
            else if(n < 0)
            {
                sum_neg = sum_neg + n;
            }
            else
            {
                System.out.println("Termination");
                break;
            }
        }

        System.out.println("Sum of negative numbers = " + sum_neg);
        System.out.println("Sum of positive even numbers = " + sum_even);
        System.out.println("Sum of positive odd numbers = " + sum_odd);
    }

    double display()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");

        double num = sc.nextDouble();

        return num;
    }
}