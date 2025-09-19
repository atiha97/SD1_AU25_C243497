import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int target = sc.nextInt();

        boolean found = false;
        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(target + " found in array.");
        else
            System.out.println(target + " not found.");
    }
}