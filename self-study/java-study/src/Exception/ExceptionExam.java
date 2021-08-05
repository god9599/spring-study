package Exception;

public class ExceptionExam {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("이거는 실행안되어요");
        } catch (ArithmeticException e) {
            System.out.println("에러발생");
            System.out.println("0으로는 못나누어요");
            e.printStackTrace(); // 어느 부분에서 예외가 발생했는 지 알려주는 추적 로그를 보여준다.
        } finally {
            System.out.println("무조건 실행되어요");
        }
    }
}
