package practice10;

public class Person {
    private int age;
    private String name;
    private int id;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        if (this.id == person.id && this.name.equals(person.name) && this.age == age) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getId() {
        return id;
    }

    public String introduce() {
        return "My name is "+name+". I am "+age+" years old.";
    }
}
