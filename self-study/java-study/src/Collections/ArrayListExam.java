package Collections;

import java.util.Arrays;

/* ArrayList
   단방향 포인터 구조로 각 데이터에 대한 인덱스를 가지고 있어 조회 기능에 성능이 뛰어남*/

public class ArrayListExam {
    public static void main(String[] args) {
        java.util.ArrayList<String> arrayList = new java.util.ArrayList<String>(Arrays.asList("박지성", "손흥민"));
        arrayList.add("이강인");
        arrayList.add(1, "나야나!"); // index 1에 나야나! 삽입 but, 중간에 데이터를 insert 해야할 경우가 많다면 LinkedList로 ㄱㄱ
        arrayList.add(null); // null값도 add 가능

        arrayList.remove(1); // index 1 제거 -> 남은 값들의 index가 1씩 땡겨짐
        arrayList.clear(); // 싹 다 제거

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("arrList" + i + " : " + arrayList.get(i));
        }

        System.out.println(arrayList.size()); // 크기
        System.out.println(arrayList.contains("이강인")); // list에 이강인이 있는 지 검사 있으면 true
        System.out.println(arrayList.indexOf("이강인")); // 이강인이 있는 index값 반환 없으면 -1
    }
}
