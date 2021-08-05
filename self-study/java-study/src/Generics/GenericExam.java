package Generics;

public class GenericExam {
    public static void main(String[] args) {
        TestGeneric<String> stringType = new TestGeneric<>();
        TestGeneric<Integer> integerType = new TestGeneric<>();
        TestGeneric<Float> floatType = new TestGeneric<>();

        stringType.sample = "I am string";
        integerType.sample = 1;
        floatType.sample = 1.1f;

        stringType.showYourType();
        integerType.showYourType();
        floatType.showYourType();
    }
}

class TestGeneric<T>{
    public T sample;
    public void showYourType() {
        if (sample instanceof Integer) {
            System.out.println("난 Integer");
        } else if (sample instanceof String) {
            System.out.println("난 String");
        } else
            System.out.println("난 다른거");
    }
}