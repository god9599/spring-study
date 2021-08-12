package chap7;

class Product{
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv1 extends Product {
    Tv1() {
        super(100);
    }
    // Object 클래스의 메서드 오버라이딩
    public String toString() {
        return "Tv";
    }
}

class Computer1 extends Product {
    Computer1(){
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product product) {
        if (money < product.price) {
            System.out.println("잔고 부족이요");
            return;
        }
        money -= product.price;
        bonusPoint += product.bonusPoint;
        System.out.println(product + "를 구매했습니다");
    }
}
public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.buy(new Tv1());
        buyer.buy(new Computer1());
        System.out.println("남은 돈 : " + buyer.money + "만원");
        System.out.println("보너스 포인트 : " + buyer.bonusPoint + "점");
    }
}
