package lab9;

import java.util.ArrayList;
import java.util.List;

public class BooksTest {
    public static void main(String[] args) {
        List<String> authors = new ArrayList<>();
        authors.add("Nguyenviethuy");
        Books book = new Books("asdfghjkl", "wertyuixcvbn", 100f, authors,
                "hom nay la thu 4 , chwdqwbdjbqdb ,qhwjqbw .wqejgqbjwb . qbqkfwef");
        book.processContent();
        System.out.print(book);
    }
}