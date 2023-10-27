package by.bat.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{
    @Override
    public void getBook(){
        System.out.println("We take the book from Uni");
    }

    public String returnBook(){
        System.out.println("We return book to Uni");
        return "Ok";
    }

    public void getMagazine(){
        System.out.println("We take the magazine from Uni");
    }

}
