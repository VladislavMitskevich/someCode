package by.bat;

//@Component("personBean")
public class Person {
    /*   @Autowired
       @Qualifier("catBean")*/
    private IPet pet;
    //  @Value("${person.surname}")
    private String surname;
    //  @Value("${person.age}")
    private int age;

    public Person(IPet pet) {
        System.out.println("Create person bean");
        this.pet = pet;
    }

    /*        public Person() {
                System.out.println("Create person bean");
            }*/
    //@Autowired
    public void setPet(IPet pet) {
        System.out.println("Person set pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("person set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("person set age");
        this.age = age;
    }

    public void callPet() {
        System.out.println("Hello my Pet");
        pet.say();
    }
}
