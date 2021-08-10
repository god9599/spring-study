package chap6;

public class BlockTest {
    static {
        System.out.println("나는 클래스 초기화 블럭. 가장 먼저 실행됨");
    }

    {
        System.out.println("나는 인스턴스 초기화 블럭. 인스턴스 생성 시 실행됨");
    }

    public BlockTest() {
        System.out.println("나는 생성자요");
    }

    public static void main(String[] args) {
        System.out.println("chap6.BlockTest bt = new chap6.BlockTest();");
        BlockTest bt = new BlockTest();
        System.out.println("chap6.BlockTest bt2 = new chap6.BlockTest()");
        BlockTest bt2 = new BlockTest();
    }
}