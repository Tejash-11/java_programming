import java.util.Scanner;

class Student {
    String name;
    int age;
    int rollNo;
    int marks;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.print("Enter rollNo: ");
        rollNo = sc.nextInt();

        System.out.print("Enter marks: ");
        marks = sc.nextInt();
    }

    void out() {
        System.out.println("-----Student Details-----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------------");
    }
}

public class Main1 {
    public static void main(String[] args) {

        Student s = new Student();

        s.input();
        s.out();
    }
}