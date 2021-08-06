package Collections;

import java.util.Stack;

public class StackExam {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);

        System.out.println(stk.peek()); // 스택 맨 위 값 단순 출력
        System.out.println(stk.contains(1)); // 스택에 1이 있는 지 check 있다면 true

        while (!stk.isEmpty()) { // Empty는 값이 비었는 지 확인 비어있다면 true
            System.out.println(stk.pop()); // 스택 꼭대기 객체 삭제. 리턴 + 삭제
        }

        /*search(find)
        - 꼭대기부터 인수로 준 객체를 스택에서 찾는다.
        - 찾으면 해당 객체의 순서를 리턴한다. 순서란 꼭대기(=1)부터 아래로 내려갈수록 1씩 증가한다.
        - 해당 객체와 동일한 객체가 다수 존재하면 꼭대기와 가장 가까운 객체의 순서를 리턴한다.
        - 해당 객체가 없을 경우 -1을 리턴한다.*/
        System.out.println(stk.search(4));
    }
}
