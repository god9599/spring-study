package chap6;

public class StaticBlockTest {
    // 명시적 초기화로 배열 생성
    static int[] arr = new int[10];

    // 클래스 초기화 블럭을 이용해 배열 채우기
    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] :" + arr[i]);
        }
    }
}
