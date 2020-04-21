import java.util.ArrayList;

public class Student {
    String studentName;
    int age;
    boolean isStudentSingle;
    String city;
    private ArrayList<Student> friends;
    private Student bestFriend;

    public Student(String studentName, int age, boolean isStudentSingle, String city) {
        this.studentName = studentName;
        this.age = age;
        this.isStudentSingle = isStudentSingle;
        this.city = city;
        this.friends = new ArrayList<>();
    }

    void addFriend(Student friend) {
        if (friend.studentName == this.studentName) {   //if (this.equals(friend))
            System.out.println("I'm already friend of myself :)");
        } else if (friends.contains(friend)) {
            System.out.println("You have already friend " + friend.studentName);
        } else {
            this.friends.add(friend);
            System.out.println("You added a new friend - " + friend.studentName);
        }
    }

    public void introduce() {
        System.out.println("*****************************");
        System.out.println("My name is " + studentName);
        System.out.println("I'm " + age + " years old");
        if (isStudentSingle) {
            System.out.println("I'm single");
        } else {
            System.out.println("I'm in a relationship ^_^ ");
        }
        System.out.print("My friends are: ");
        for (Student str : friends) {
            System.out.print(str.studentName + ", ");
        }
        System.out.println();
        System.out.println("*****************************");
    }
}

