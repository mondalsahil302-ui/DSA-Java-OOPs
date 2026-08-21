
import java.util.*;

public class binarysearch {

    static int[] arrayTraverse(int n) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5};

        return arr;
    }
   static void binarySearch(int[] arr, int num) {

    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {

        int mid = (low + high) / 2;

        if (arr[mid] == num) {
            System.out.println("Element found");
            return;
        }

        if (num > arr[mid]) {
            low = mid + 1;
        }

        if (num < arr[mid]) {
            high = mid - 1;
        }
    }

    System.out.println("Element not found");
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = arrayTraverse(n);

        System.out.println("\nEnter the number to search:");
        int m = sc.nextInt();
        binarySearch(arr, m);
    }
}