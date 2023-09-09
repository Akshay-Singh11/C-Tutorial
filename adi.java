class Student {
    String name;

    Student(String n) {
        System.out.println("i am a constructor.");
    }

    // Student(String name) {
    // System.out.println(name);
    // }

    // void hello() {
    // System.out.println("hello"+" "+name);
    // }
}

public class adi {
    public static void main(String[] args) {
        Student s = new Student("adi");

        // s.hello();
        // new Student();
    }
}
