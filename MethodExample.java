public class MethodExample {
    static void greet() {
        System.out.println("Hello Sakshi!");
    }

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        greet();
        System.out.println("Sum: " + add(5, 3));
    }
}
