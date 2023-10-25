package by.bat;

public class Dog implements IPet{
    private String name;
    public Dog() {
        System.out.println("bean for dog");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
