import java.util.*;

public class Switch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("A : For Maximum minimum print ");
        System.out.println("B : For Rupee to Usd converstion ");
        System.out.println("C : For Fibonacci");
        System.out.println("D : For Factorial");
        System.out.println("E : For palindreome");
        System.out.println("F : For amstrong ");

        System.out.print("Enter the option: ");
        char ch = sc.next().charAt(0);

        switch(ch)
        {
            case 'A':
            case 'a':
                {
                    System.out.println("Enter the two numbers:");
                     int n1 = sc.nextInt();
                     int n2 = sc.nextInt();
                     if(n1>n2)
                     {
                        System.out.println(n1 + "maximum");
                        System.out.println(n2 + "manimum");
                     }
                     else
                     {
                        System.out.println(n2+ "maximum");
                        System.out.println(n1 + "minimum");
                     }
                } 

                break;

            case 'B':
            case 'b':
                {
                    System.out.print
            
                    ("Enter the Indian Rupess :RS");
                    double rupees = sc.nextDouble();
                    double Usd = rupees*0.011;
                    System.out.println("The Usd :$" + Usd);

                    
                }
                
                break;

            case 'C':
            case 'c':
                {
                    System.out.println("the size of fibonacci series" );
                    int n =sc.nextInt();
                    int a=0;
                    int b=1;
                    System.out.print( "The series :"+ a +" " + b);
                    for (int i=2;i<=n;i++)
                    {
                        int c=a+b;
                        a=b;
                        b=c;
                    
                        System.out.print(" "+c);


                    }


                }
                
                break;

            case 'D':
            case 'd':
        
                {
                    System.out.println( "Enter a number  :"  );
                    int num = sc.nextInt();
                    int f=1;
                    int fact=0;
                    for(int i=1;i<=num;i++)
                    {
                        f=f*i;
                    }
                    System.out.println( "The Fibonacci :"+ fact  );

                }
                break;
            case 'E':
            case 'e':
                {
                    System.out.println( "Enter a number  :"  );
                    int number =sc.nextInt();
                    int number_copy = number;
                    int palindrome =0;
                    while (number!=0) 
                        {
                            int k =number%10;
                             palindrome = palindrome*10+ k;
                             number=number/10;

                        
                    }
                    if(palindrome == number_copy)
                    {
                        System.out.println( "The palindrome :"+ palindrome  );
                    }
                    else
                    {
                        System.out.println( "Not The palindrome :"  );
                    }
                }
                break;
                
            case 'F':
            case 'f':
                {
                    System.out.println( "Enter a number  :"  );
                    int ams = sc.nextInt();
                    int ams_copy = ams;
                    int length = String.valueOf(ams_copy).length();
                     System.out.println( "The length:"  + length);
                     int ams_sum=0;
                     while(ams_copy!=0)
                     {
                        int p = ams_copy%10;
                        ams_sum =  ams_sum + (int)Math.pow(p, length);
                        ams_copy=ams_copy/10;

                     }
                     if(ams_sum == ams)
                    {
                        System.out.println( "The amstrong :"+ ams );
                    }
                    else
                    {
                        System.out.println( "Not The amstromg :"  );
                    }
                }
                break;

            default:
                System.out.println("Error: Invalid Option");
        }

        sc.close();
    }
}