package practice11;

import java.util.ArrayList;

public class Klass {
    private int number;
    private Student leader= new Student(-1,null,-1,null);
    private ArrayList<Student> studentList = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class "+number;
    }

    public void assignLeader(Student jerry) {
        if (isIn(jerry)) {
            leader = jerry;
            System.out.print("I am Tom. I know " + jerry.getName() + " become Leader of Class " + this.getNumber() + ".\n");
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student jerry) {
        if (!isIn(jerry)) {
            studentList.add(jerry);
            System.out.print("I am Tom. I know " + jerry.getName() + " has joined Class " + this.getNumber() + ".\n");
        }
    }

    public boolean isIn(Student jerry) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == jerry.getId()) {
                return true;
            }
        }
        return false;
    }
}
