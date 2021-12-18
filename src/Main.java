import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = sc.nextLine();
        if (isPalindrome(string) == true) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }
        System.out.println(isPalindrome(string));
    }
    public static boolean isPalindrome(String string) {
        string = string.toLowerCase();
        string = string.replace(" ", "");
        return string.equals((new StringBuilder(string)).reverse().toString());
    }
}
