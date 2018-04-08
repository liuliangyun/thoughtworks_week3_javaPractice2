package practice09;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return  klass;
    }

    public String introduce() {
        String result = super.introduce();
        if (klass.getLeader().getName()!=null && klass.getLeader().getName().equals("Tom")){
            result += " I am a Student. I am Leader of Class " + klass.getNumber() + ".";
        } else {
            result += " I am a Student. I am at Class " + klass.getNumber() + ".";
        }
        return result;
    }
}
