package by.bat;

public class Cat implements IPet{
    public Cat() {
        System.out.println("bean for cat");
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
