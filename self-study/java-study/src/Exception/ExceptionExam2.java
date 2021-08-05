package Exception;

public class ExceptionExam2 {
    public static void call(int j) {
        try {
            int[] i = {1, 2, 3};
            System.out.println(i[j]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 크기에 맞는 값을 선택하세욧");
            e.printStackTrace();
        } finally {
            System.out.println("무조건 실행한다니깐~~");
        }
    }

    public void brr(int i, int j) throws ArithmeticException {
        int c = i / j;
        System.out.println(c);
    }
    
    public static void main(String[] args) {
        call(4);
        
        ExceptionExam2 et = new ExceptionExam2();
        try {
            et.brr(3, 0);
        } catch (ArithmeticException e) {
            e.getMessage();
            e.printStackTrace();
        } finally {
            System.out.println("무조건 실행한다니깐!!");
        }
    }
}
