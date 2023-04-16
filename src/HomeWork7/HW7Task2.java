package HomeWork7;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW7Task2 {
    public static void numb() {
        List<String> numbers = new ArrayList<>();
        numbers.add("(+380)633018147");
        numbers.add("(+380)963018147");
        numbers.add("(+380)63301814");
        numbers.add("+380633018147");
        numbers.add("(380)633018147");
        numbers.add("(+38)633018147");
        numbers.add("(+380)63 3018147");
        numbers.add("(+380)63-3018147");
        numbers.add("( +380 )633018147");
        numbers.add("(+380)633018147 ");
        numbers.add("+(+380)633018147");
        numbers.add(" (+380)633018147");
        numbers.add("+(+380)633018147!");

        String regex = "^\\(\\+380\\)\\d{9}$";

        Pattern patern = Pattern.compile(regex);

        for (String number : numbers) {
            Matcher matcher = patern.matcher(number);
            System.out.println(number + " : " + matcher.matches());
        }
    }

    public static void main(String[] args) {
        numb();
    }
}