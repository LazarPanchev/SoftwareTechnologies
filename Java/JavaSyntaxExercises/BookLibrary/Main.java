package JavaSyntaxExercises.BookLibrary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalBooks = Integer.parseInt(scanner.nextLine());
        ArrayList<Book> booksList = new ArrayList<Book>();

        Map<String, Double> authorSum= new LinkedHashMap<>();
        for (int i = 0; i < totalBooks; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            LocalDate date = LocalDate.parse(tokens[3], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            double price = Double.parseDouble(tokens[5]);
            Book currentBook = new Book(tokens[0], tokens[1], tokens[2], date, tokens[4], price);
            booksList.add(currentBook);
        }

        Library currentLibrary = new Library("Prosveta", new ArrayList<Book>(booksList));

        for(Book book : currentLibrary.getBookList()){
            if(authorSum.containsKey(book.getAuthor())){
                double oldValue =authorSum.get(book.getAuthor());
                authorSum.put(book.getAuthor(), oldValue+book.getPrice());
            }else {
                authorSum.put(book.getAuthor(), book.getPrice());
            }
        }

        authorSum.entrySet()
                .stream()
                .sorted((a1,a2)->{
                    int compareResult = Double.compare(a2.getValue(), a1.getValue());
                    if(compareResult==0){
                        compareResult=a1.getKey().compareTo(a2.getKey());
                    }

                    return compareResult;
                })
                .forEach(a->System.out.printf("%s -> %.2f%n", a.getKey(), a.getValue()));
    }
}
