package by.bat;

import org.springframework.stereotype.Component;

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

    public void init(){
        System.out.println("init method");
    }

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
