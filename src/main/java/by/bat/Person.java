package by.bat;

public class Person {
    private IPet pet;

    public Person(IPet pet) {
        System.out.println("Create person bean");
        this.pet = pet;
    }

    public void callPet(){
        System.out.println("Hello my Pet");
        pet.say();
    }
}
