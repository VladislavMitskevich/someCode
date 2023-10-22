package by.bat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicatiomContext.xml");

        IPet pet = context.getBean("myPet", IPet.class);
        pet.say();

        context.close();
    }
}
