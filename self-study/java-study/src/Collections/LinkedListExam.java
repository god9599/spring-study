package Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExam {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1); // 가장 앞에 데이터 추가
        list.add(3);
        list.addLast(2); // 가장 마지막에 데이터 추가
        list.add(1, 4); // index 1에 데이터 4 추가

        Iterator iter = list.iterator(); // Iterator 선언
        while (iter.hasNext()) { // has.next()를 통해 다음에 값이 있는 지 검사하면서 출력
            System.out.println(iter.next());
        }

        /*LinkedList의 값이 제거되는 방식
        삭제 대상 노드의 이전의 노드가 삭제 대상 노드의 다음의 노드를 가리키게 하고 해당 노드는 삭제된다.*/

        list.removeFirst();
        list.removeLast();
        list.remove(1); // index 1 제거
        list.remove(); // 생략시 index 0 제거
        list.clear(); // 싹 다 제거

        // LinkedList 값 검색
        LinkedList<Integer> wow = new LinkedList<>(Arrays.asList(1, 2, 3));
        System.out.println(wow.contains(1)); // list에 1이 있는 지 검사 있으면 true 반환.
        System.out.println(wow.indexOf(1)); // 1이 있는 index 반환 없으면 -1 반환.
    }
}


