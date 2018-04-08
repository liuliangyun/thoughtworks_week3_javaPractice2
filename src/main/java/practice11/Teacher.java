package practice11;

import java.util.ArrayList;
import java.util.HashSet;

public class Teacher extends  Person{
    private HashSet<Klass> classes = new HashSet<>();
    public Teacher(int id, String name, int age, HashSet<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public HashSet<Klass> getClasses() {
        return classes;
    }

    public String introduce() {
        String result = super.introduce();
        if (classes.size()==0){
            result += " I am a Teacher. I teach No Class.";
        } else {
            result += " I am a Teacher. I teach Class ";
            ArrayList<Klass> copyOfClasses = new ArrayList<>();
            copyOfClasses.addAll(classes);
            for (int i = 0; i < copyOfClasses.size()-1; i++) {
                result += copyOfClasses.get(i).getNumber() + ", ";
            }
            result += copyOfClasses.get(copyOfClasses.size() - 1).getNumber() + ".";
        }
        return result;
    }

    public String introduceWith(Student jerry) {
        String result = super.introduce();
        if (isTeaching(jerry)) {
            result += " I am a Teacher. I teach Jerry.";
        } else {
            result +=" I am a Teacher. I don't teach Jerry.";
        }
        return result;
    }

    public boolean isTeaching(Student jerry) {
        for (Klass aClass : classes) {
            if (aClass.getNumber() == jerry.getKlass().getNumber()) {
                return true;
            }
        }
        return false;
    }

}
