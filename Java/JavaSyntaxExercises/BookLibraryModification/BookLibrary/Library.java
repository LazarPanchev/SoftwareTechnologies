package JavaSyntaxExercises.BookLibraryModification.BookLibrary;

import java.util.List;

public class Library {
    private String name;

    private List<Book> bookList;

    public Library(String name, List<Book> bookList) {
        this.name = name;
        this.bookList = bookList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
