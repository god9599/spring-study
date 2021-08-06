package Collections;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

// TreeSet은 이진 트리 기반. 값을 넣으면 자동으로 정렬된다.

public class TreeSetExam {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(40);
        set.add(20);
        set.add(30);
        set.add(50);
        set.add(10);

        System.out.println(set.first()); // 맨 앞에 값 출력.
        System.out.println(set.last()); // 맨 뒤 값 출력.
        System.out.println(set.lower(new Integer(40))); //40 바로 아래 점수 출력
        System.out.println(set.higher(new Integer(40))); // 40 바로 위 점수 출력
        System.out.println(set.floor(new Integer(40))); // 40이거나 바로 아래 점수 출력
        System.out.println(set.ceiling(new Integer(40))); // 40이거나 바로 위 점수 출력
        System.out.println(set.pollFirst()); // 맨 앞에 값을 가져오면서 제거함
        System.out.println(set.pollLast()); // 맨 뒤에 값을 가져오면서 제거함

        NavigableSet<Integer> descendingSet = set.descendingSet();
        NavigableSet<Integer> ascendingSet = set.descendingSet();

        // 내림차순
        for (int i : descendingSet) {
            System.out.println(i);
        }

        // 역순 출력 (오름 차순)
        Iterator<Integer> iter = ascendingSet.descendingIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
