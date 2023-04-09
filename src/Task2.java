import java.util.*;

public class Task2 {
    public static Map<Integer, String> convertToMap(List<String> booksList) {
        Map<Integer, String> booksMap = new HashMap<>();

        for (int i = 0; i < booksList.size(); i++) {
            booksMap.put(i, booksList.get(i));
        }

        return booksMap;
    }

    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>(Arrays.asList("Book1", "Book2", "Book3", "Book4", "Book5"));
        System.out.println(convertToMap(books));
    }
}