import java.util.Scanner;

public class Main {
    /**
     * @param number Three digits number in the range -999 - 999. Eg. "123"
     * @return The sum of digits of the number
     */

    public static int processInput(int number) {
        number = Math.abs(number);

        int d1 = number % 10;
        int d10 = (number % 100 - d1) / 10;
        int d100 = (number % 1000 - (d10 * 10) - d1) / 100;

        return d1 + d10 + d100;
    }

    /**
     * @param word1 random word
     * @param word2 random word
     * @return The sum of the length of word1 + word2
     */

    public static int processInput(String word1, String word2) {
        return word1.length() + word2.length();
    }

    /**
     * @return TRUE - if number>0, FALSE - if number<=0
     */

    public static boolean processInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter integer number:");
        int number = sc.nextInt();

        if(number > 0) {
            System.out.println("Number is greater than zero");
        } else {
            System.out.println("Number is not greater than zero");
        }

        return number > 0;
    }

    public static void main(String[] args) {
        System.out.println(processInput(-523));
        System.out.println(processInput("test", "now"));
        System.out.println(processInput());
    }
}