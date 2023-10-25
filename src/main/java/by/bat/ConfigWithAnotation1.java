package by.bat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicatiomContext3.xml");

        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();

        context.close();
    }
}
