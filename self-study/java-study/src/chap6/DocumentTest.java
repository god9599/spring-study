package chap6;

class Document {
    static int count = 0;
    String name;

    Document() {
        this("제목 없음" + ++count); // this()로 다른 생성자 호출
    }
    Document(String name) {
        this.name = name;
        System.out.println("문서 " + this.name + "가 생성되었습니다");
    }
}
public class DocumentTest {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document("하이루");
        Document d3 = new Document();
        Document d4 = new Document();
    }
}
