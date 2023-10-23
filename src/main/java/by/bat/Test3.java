package by.bat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicatiomContext.xml");
        // IPet pet = context.getBean("myPet", IPet.class);
        //IPet pet = new Dog();
        Person person = context.getBean("myPerson", Person.class);
        person.callPet();

        context.close();
    }
}
