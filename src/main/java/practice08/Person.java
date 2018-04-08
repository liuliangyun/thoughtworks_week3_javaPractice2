package practice08;

public class Person {
    private int age;
    private String name;
    private int id;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        if (this.id == person.id) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id + name.length() + age;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public String introduce() {
        return "My name is "+name+". I am "+age+" years old.";
    }
}
