package Stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class CollectionStreamExam {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);

        // 컬렉션에서 스트림 생성
        Stream<Integer> stream = list.stream();
        // forEach() 메서드로 해당 스트림의 요소를 하나씩 소모해가며 순차적으로 요소에 접근.
        // 같은 스트림으로는 한 번밖에 호출할 수 없다.
        stream.forEach(System.out::println);
        // 원본 데이터 요소를 소모하는 것은 아님
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
