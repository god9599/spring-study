package chap7;

// 참조변수의 형변환을 통해서 참조하고 있는 인스턴스에서 사용할 수 있는 멤버 범위를 조절

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // car = (Car)fe; 업캐스팅이라 생략 가능
        fe2 = (FireEngine)car;
        fe2.water();
    }
}

class Car {
    String color;
    int door;
    void drive() {
        System.out.println("brrrr!!");
    }
    void stop() {
        System.out.println("stop!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water 부아악!");
    }
}
