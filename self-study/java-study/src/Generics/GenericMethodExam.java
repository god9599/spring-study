package Generics;

public class GenericMethodExam {
    public static void main(String[] args) {
        Data.showData("HI");
        Data.showData(1);
        Data.showData(1.1f);
    }
}

class Data {
    public static <T> T showData(T data) {
        if (data instanceof String) {
            System.out.println("String");
        } else if (data instanceof Integer) {
            System.out.println("Integer");
        } else
            System.out.println("Other");

        return data;
    }
}