
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;

        while (true) {
            System.out.print("Введіть слово (або 'вихід' для завершення): ");
            word = scanner.nextLine().toLowerCase();

            if (word.equals("вихід")) {
                break;
            }

            if (isPalindrome(word)) {
                System.out.println(word + " є паліндромом.");
            } else {
                System.out.println(word + " не є паліндромом.");
            }
        }
    }

    public static boolean isPalindrome(String word) {

        word = word.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}