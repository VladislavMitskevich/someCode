package by.bat.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook(){
        System.out.println("We take the book from Uni");
    }

    public void returnBook(){
        System.out.println("We return book to Uni");
    }

    public void getMagazine(){
        System.out.println("We take the magazine from Uni");
    }

    public void returnMagazine(){
        System.out.println("We return magazine to Uni");
    }

    public void addBook(){
        System.out.println("We add the book to Uni");
    }

    public void addMagazine(){
        System.out.println("We add the magazine to Uni");
    }

}
