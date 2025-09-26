import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int result = 0, digits = 0, temp = num;
        do {
            temp /= 10;
            digits++;
        } while (temp != 0);

        temp = num;
        do {
            int rem = temp % 10;
            result += Math.pow(rem, digits);
            temp /= 10;
        } while (temp != 0);

        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

        sc.close();
    }
}
