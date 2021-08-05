package Exception;

public class ExceptionExam_throws {
    public static void divide(int a, int b) throws Exception {
        if (b == 0) {
            throw new ArithmeticException("0으로 나눌 수 없어요");
        }
        int c = a / b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            divide(a, b);
        } catch (Exception e) {
            e.getMessage(); // 메시지를 받는 메서드
            e.printStackTrace();
        }
    }
}
