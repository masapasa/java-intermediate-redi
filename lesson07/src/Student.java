import java.util.ArrayList;
import java.util.List;

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
    public Student(String studentName, int age, boolean isStudentSingle, String city, ArrayList<Student> friends) {
        this(studentName, age, isStudentSingle, city);
        this.friends = friends;
    }

    void addFriend(Student friend) {
        if (friend.studentName == this.studentName) {   //if (this.equals(friend))
            System.out.println("I'm already friend of myself :)");
        } else if (friends.contains(friend)) {
            System.out.println("You have already this friend");
        } else {
            this.friends.add(friend);
            System.out.println("You added a new friend - " + friend.studentName);
        }
    }

    void addFriend(Student friend, boolean isBestFriend) {
        this.addFriend(friend);
        if (isBestFriend) {
            if (this.bestFriend == null) {
                this.bestFriend = friend;
            } else {
                System.out.println("You already have a best friend with name " + this.bestFriend.studentName);
            }
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
        System.out.println("My friends are: ");

        for (Student str : friends) {
            System.out.println(str.studentName);
        }
//        friends.forEach(System.out::println);
        System.out.println("My best friend is " + this.bestFriend.studentName);
        System.out.println("*****************************");
    }

    //Exercise 4 - not finished, not ideas how
    public int firendsHandshakes(ArrayList<Student> students, String firstName, String secondName) {
        int handshakes = 0;
        Student first = null;
        String second = null;
        for (Student student : students) {
            if (firstName == student.studentName) {
                first = student;
            }

            if (first != null) {
                List<Student> firstFriends = first.friends;
                for (Student firstFriend : firstFriends) {
                    if (secondName == firstFriend.studentName) {
                        handshakes++;
                    }
                }
            }else handshakes++;
        }
        System.out.println(handshakes);
        return handshakes;
    }


}

