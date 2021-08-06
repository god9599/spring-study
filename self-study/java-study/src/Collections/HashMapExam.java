package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExam {
    public static void main(String[] args) {
        // map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();

        // 객체 저장
        map.put("주성민", 25);
        map.put("김만두", 35);
        map.put("이순대", 45);

        // 객체 찾기
        System.out.println("주성민 : " + map.get("주성민"));
        // 객체 하나씩 처리
        Iterator<String> iter = map.keySet().iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            int value = map.get(key);
            System.out.println(key + " : " + value);
        }
        map.remove("주성민");
        System.out.println();
        // 반복자 초기화
        iter = map.keySet().iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            int value = map.get(key);
            System.out.println(key + " : " + value);
        }

        /*@Return
        [김만두=35, 이순대=45]*/
        System.out.println(map.entrySet()); 
        /*@Return
        [김만두, 이순대]*/
        System.out.println(map.keySet());
        /*@Return
        [35, 45]*/
        System.out.println(map.values());
    }
}
