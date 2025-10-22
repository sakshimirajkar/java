class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            throw new MyException("This is a custom exception!");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
