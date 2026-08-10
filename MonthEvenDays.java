import java.util.*;

public class MonthEvenDays {
    static int getDays(int month) {
        switch(month) {
            case 1: return 31; // January
            case 2: return 28; // February
            case 3: return 31; // March
            case 4: return 30; // April
            case 5: return 31; // May
            case 6: return 30; // June
            case 7: return 31; // July
            case 8: return 31; // August
            case 9: return 30; // September
            case 10: return 31; // October
            case 11: return 30; // November
            case 12: return 31; // December
            default: return -1;
        }
    }
    static int countEvenDays(int days) {
        int count = 0;

        for(int i = 1; i <= days; i++) {
            if(i % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        int days = getDays(month);

        if(days == -1) {
            System.out.println("Invalid Month");
        } else {
            int evenDays = countEvenDays(days);

            System.out.println("Total Days = " + days);
            System.out.println("Even Dates = " + evenDays);
        }

        sc.close();
    }
}