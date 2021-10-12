package chap12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Fruit1{
    String name;
    int weight;

    Fruit1(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String toString() {
        return name + "(" + weight + ")";   
    }
}

class Apple1 extends Fruit1{
    Apple1(String name, int weight) {
        super(name, weight);
    }
}

class Grape1 extends Fruit1 {
    Grape1(String name, int weight) {
        super(name, weight);
    }
}

class AppleComp implements Comparator<Apple1> {
    public int compare(Apple1 t1, Apple1 t2) {
        return t2.weight - t1.weight;
    }
}

class GrapeComp implements Comparator<Grape1> {
    public int compare(Grape1 t1, Grape1 t2) {
        return t2.weight - t1.weight;
    }
}

class FruitComp implements Comparator<Fruit1> {
    public int compare(Fruit1 t1, Fruit1 t2) {
        return t1.weight - t2.weight;
    }
}

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox1<Apple1> appleBox = new FruitBox1<>();
        FruitBox1<Grape1> grapeBox = new FruitBox1<>();

        appleBox.add(new Apple1("GreenApple", 300));
        appleBox.add(new Apple1("GreenApple", 100));
        appleBox.add(new Apple1("GreenApple", 200));

        grapeBox.add(new Grape1("GreenGrape", 300));
        grapeBox.add(new Grape1("GreenGrape", 100));
        grapeBox.add(new Grape1("GreenGrape", 200));

        Collections.sort(appleBox.getList(), new AppleComp());
        Collections.sort(grapeBox.getList(), new GrapeComp());
        System.out.println(appleBox);
        System.out.println(grapeBox);
        Collections.sort(appleBox.getList(), new FruitComp());
        Collections.sort(grapeBox.getList(), new FruitComp());
        System.out.println(appleBox);
        System.out.println(grapeBox);
    }
}

class FruitBox1<T extends Fruit1> extends Box1<T> {}

class Box1<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item); }
    T get(int i) { return list.get(i); }
    ArrayList<T> getList() { return list; }
    int size() {return list.size(); }
    public String toString() { return list.toString(); }
}

