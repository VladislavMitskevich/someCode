package by.bat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicatiomContext3.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callPet();

/*        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();*/

        context.close();
    }
}
