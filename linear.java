import java.util.*;

public class linear {

    static int[] arrayTraverse(int n) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        return arr;
    }
    static void linearSearch(int[] arr, int m) {

        int c = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == m) {
                c++;
            }
        }

        if (c == 1) {
            System.out.println("\nElement found");
        } else {
            System.out.println("\nElement not found");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = arrayTraverse(n);

        System.out.println("\nEnter the number to search:");
        int m = sc.nextInt();
        linearSearch(arr, m);
    }
}