package practice07;

public class Teacher extends Person{
    private Klass klass;
    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        String result = super.introduce();
        if (klass == null){
            result += " I am a Teacher. I teach No Class.";
        } else {
            result += " I am a Teacher. I teach Class " + klass.getNumber() + ".";
        }
        return result;
    }

    public String introduceWith(Student jerry) {
        String result = super.introduce();
        if (jerry.getKlass().getNumber() == klass.getNumber()) {
            result += " I am a Teacher. I teach Jerry.";
        } else {
            result +=" I am a Teacher. I don't teach Jerry.";
        }
        return result;
    }
}
