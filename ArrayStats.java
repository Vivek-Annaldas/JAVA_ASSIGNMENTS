import java.util.Scanner;

public class ArrayStats{
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 integers:");
        for(int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = nums[0], max = nums[0], min = nums[0];
        for(int i = 1; i < 10; i++) {
            sum += nums[i];
            if(nums[i] > max) max = nums[i];
            if(nums[i] < min) min = nums[i];
        }

        double average = sum / 10.0;
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        sc.close();
    }
}
