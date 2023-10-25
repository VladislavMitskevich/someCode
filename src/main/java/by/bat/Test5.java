package by.bat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicatiomContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);

        myDog.say();

        context.close();
    }
}
