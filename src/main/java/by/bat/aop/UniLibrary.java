package by.bat.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We take the book from Uni");
        System.out.println("-----------------");
    }

    public String returnBook() {
        int a = 10/0;
        System.out.println("We return book to Uni");
        return "war and peace";
    }

    public void getMagazine() {
        System.out.println("We take the magazine from Uni");
        System.out.println("-----------------");
    }

    public void returnMagazine() {
        System.out.println("We return magazine to Uni");
        System.out.println("-----------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("We add the book to Uni");
        System.out.println("-----------------");
    }

    public void addMagazine() {
        System.out.println("We add the magazine to Uni");
        System.out.println("-----------------");
    }

}
