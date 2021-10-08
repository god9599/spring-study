package chap11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(1000000);
        LinkedList linkedList = new LinkedList();
        add(list);
        add(linkedList);
        System.out.println("= 접근시간 테스트 =");
        System.out.println("ArrayList : " + access(list));
        System.out.println("LinkedList : " + access(linkedList));
    }

    public static void add(List list) {
        for (int i = 0; i < 1000000; i++) list.add(i + "");
    }

    public static long access(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) list.get(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
