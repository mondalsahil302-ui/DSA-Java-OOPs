import java.util.*;
class intrest 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println (" Enter the amount:");
        int Amt = sc.nextInt();
        System.out.println (" the Rate of intrest  :"  );
        int r = sc.nextInt();
        System.out.println (" the time  :"  );
        int time = sc.nextInt();
        double SI = (Amt * r * time)/100;
        System.out.println (" the simple intrest  :"+ SI  );
        sc.close();


    }
}
