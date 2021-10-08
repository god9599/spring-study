package chap11;

import java.util.*;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        print(list1, list2);

        Collections.sort(list1);
        Collections.sort(list2);

        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));

        //list1에서 list2와 겹치는 부분만 남기고 나머지 삭제
        System.out.println("list1.ratainAll(list2) : " + list1.retainAll(list2));

        print(list1, list2);

        // list2에서 list1에 포함된 객체들을 삭제
        for (int i = list2.size() - 1; i >= 0; i--) { // list2의 첫 번째 인덱스부터 반복문을 돌리면 삭제될 때 빈 공간을 채우기 위해 나머지 요소들이 자리이동을 하기 떄문에 마지막 인덱스 부터 돌린다.
            if (list2.contains(list2.get(i))) {
                list2.remove(i);
            }
        }
    }

    private static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
    }
}
