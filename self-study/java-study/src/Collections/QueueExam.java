package Collections;

import java.util.LinkedList;
import java.util.Queue;

/* 자바에서 Queue는 인터페이스이므로 객체 생성이 불가능하다.
*  따라서 LinkedList를 형변환해서 조작한다. */

/* 큐는 프론*/
public class QueueExam {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i < 4; i++) {
            queue.add(i);
            // queue = [1, 2, 3, 4] , front = 0 , rear = 3
        }
        System.out.println(queue.peek()); // 큐의 프론트 값 반환
        System.out.println(queue.poll()); // 큐의 프론트 값을 반환하고 삭제
        System.out.println(queue.isEmpty()); // 큐가 비어있으면 true
    }
}
