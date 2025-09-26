import java.util.Scanner;

public class BubbleBinary {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 integers:");
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble Sort
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for(int n : arr) System.out.print(n + " ");
        System.out.println();

        // Binary Search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int left = 0, right = 9, mid, pos = -1;
        while(left <= right) {
            mid = (left + right) / 2;
            if(arr[mid] == key) {
                pos = mid;
                break;
            } else if(arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if(pos != -1)
            System.out.println("Element found at index: " + pos);
        else
            System.out.println("Element not found.");
        sc.close();
    }
}
