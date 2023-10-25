package by.bat;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
      //  IPet myCat = context.getBean("catBean", IPet.class);
      //  IPet cat1 = context.getBean("catBean", IPet.class);
      //  myCat.say();

        Person person = context.getBean("personBean", Person.class);
        person.callPet();

        context.close();
    }
}
