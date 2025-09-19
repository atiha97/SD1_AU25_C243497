import java.util.Scanner;

public class EligibleVoters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of people and minimum voting age
        System.out.print("Enter number of people: ");
        int N = sc.nextInt();

        System.out.print("Enter minimum voting age: ");
        int X = sc.nextInt();

        int count = 0;

        System.out.println("Enter ages of " + N + " people:");
        for (int i = 0; i < N; i++) {
            int age = sc.nextInt();
            if (age >= X) {
                count++;
            }
        }

        System.out.println("Number of eligible voters: " + count);
    }
}
