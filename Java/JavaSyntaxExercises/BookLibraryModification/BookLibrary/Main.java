package JavaSyntaxExercises.BookLibraryModification.BookLibrary;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalBooks = Integer.parseInt(scanner.nextLine());
        ArrayList<Book> booksList = new ArrayList<Book>();

        Map<String, LocalDate> titleDateMap= new LinkedHashMap<>();
        for (int i = 0; i < totalBooks; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            LocalDate date = LocalDate.parse(tokens[3], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            double price = Double.parseDouble(tokens[5]);
            Book currentBook = new Book(tokens[0], tokens[1], tokens[2], date, tokens[4], price);
            booksList.add(currentBook);
        }

        LocalDate dateForCompare=LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        Library currentLibrary = new Library("Prosveta", new ArrayList<Book>(booksList));

        for(Book book : currentLibrary.getBookList()){
                titleDateMap.put(book.getTitle(), book.getReleaseDate());

        }

        titleDateMap.entrySet()
                .stream()
                .filter(b->b.getValue().isAfter(dateForCompare))
                .sorted(Comparator.comparing((Function<Map.Entry<String, LocalDate>, LocalDate>) Map.Entry::getValue).thenComparing(Map.Entry::getKey))
                .forEach(a->System.out.printf("%s -> %s%n", a.getKey(),a.getValue().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))));
    }
}
