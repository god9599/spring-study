package chap11;

import java.util.Stack;

public class StackEx1 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        goURL("1.네이트");
        goURL("2.야후");
        goURL("3.네이버");
        goURL("4.다음");

        printStatus();

        goBack();
        System.out.println("뒤로가기 버튼");
        printStatus();

        goBack();
        System.out.println("뒤로 버튼");
        printStatus();

        goForward();
        System.out.println("앞으로 버튼");
        printStatus();

        goURL("test.com");
        System.out.println("새로운 url 이동");
        printStatus();
    }

    public static void printStatus() {
        System.out.println("back: " + back);
        System.out.println("forward: " + forward);
        System.out.println("'현재 화면은 '" + back.peek() + "' 입니다.'");
        System.out.println();
    }

    public static void goURL(String url) {
        back.push(url);
        if (!forward.isEmpty()) {
            forward.clear();
        }
    }

    public static void goForward() {
        if (!forward.isEmpty()) {
            back.push(forward.pop());
        }
    }

    public static void goBack() {
        if (!back.isEmpty()) {
            forward.push(back.pop());
        }
    }
}
