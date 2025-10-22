class Student {
    String name;
    int age;

    void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sakshi";
        s1.age = 21;
        s1.showDetails();
    }
}
