package Generics;

public class LimitGenericsExam <M extends BoxMaterial> {
    private M material;

    public LimitGenericsExam(M material) {
        this.material = material;
    }
    public void printInfo() {
        System.out.println(material.printInfo() + "입니다");
    }
    public static void main(String[] args) {
        LimitGenericsExam<Paper> paper = new LimitGenericsExam<>(new Paper());
        LimitGenericsExam<Plastic> plastic = new LimitGenericsExam<>(new Plastic());
        paper.printInfo();
        plastic.printInfo();
    }
}

class BoxMaterial {
    public String printInfo() {
        return "";
    }
}

class Paper extends BoxMaterial {
    @Override
    public String printInfo() {
        return "종이";
    }
}

class Plastic extends BoxMaterial {
    @Override
    public String printInfo() {
        return "플라스틱";
    }
}
