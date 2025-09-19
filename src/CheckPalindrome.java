import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}