package chap6;

class Product {
    static int count = 0; // 생성된 인스턴스의 수를 저장하기 위한 변수
    int serialNo;
    {
        ++count;
        serialNo = count; // Product 인스턴스가 생성될 때마다 count의 값을 1 증가시켜 저장
    }
    public Product() {}
}

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println(p1.serialNo);
        System.out.println(p2.serialNo);
        System.out.println(p3.serialNo);
        System.out.println("생산된 제품 수 : " + Product.count);
    }
}
