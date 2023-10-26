package by.bat.aop;

import org.springframework.stereotype.Component;

@Component("libBean")
public class Library {
    public void getBook(){
        System.out.println("We take the book");
    }
}
