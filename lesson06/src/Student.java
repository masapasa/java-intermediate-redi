import java.util.ArrayList;

public class Student {
    String studentName;
    int age;
    boolean isStudentSingle;
    String city;
    ArrayList<String> friends;

    public Student(String studentName, int age, boolean isStudentSingle, String city) {
        this.studentName = studentName;
        this.age = age;
        this.isStudentSingle = isStudentSingle;
        this.city = city;
        this.friends = new ArrayList<>();
    }

    void addFriend(String friend) {
        this.friends.add(friend);
    }

    public void introduce() {
        System.out.println("My name is " + studentName);
        System.out.println("I'm " + age + " years old");
        if (isStudentSingle) {
            System.out.println("I'm single");
        } else {
            System.out.println("I'm in a relationship ^_^ ");
        }
        System.out.println("My friends are: ");
        friends.forEach(System.out::println);
    }
}
