public class TryCatch {
    public static void main(String[] args) {
        int a;  // declare once
        try {
            a = 10 / 0;  // assign value (no 'int' keyword again)
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
    }
}
