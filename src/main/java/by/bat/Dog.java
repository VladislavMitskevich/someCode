package by.bat;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog implements IPet{
   // private String name;
    public Dog() {
        System.out.println("bean for dog");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    @PostConstruct
    public void init(){
        System.out.println("init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy method");
    }

/*    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/
}
