package chap11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10;
        String src = "01234124FEWEGKKWKDMWKMFWKMF920202()";
        int length = src.length();

        List list = new ArrayList(length / LIMIT + 10); // 크기를 더 여유있게 설정. 크기보다 더 추가되면 자동으로 늘어나는데 처리시간이 길다.

        for (int i = 0; i < length; i += LIMIT) {
            if (i + LIMIT < length) {
                list.add(src.substring(i, i + LIMIT));
            } else
                list.add(src.substring(i));
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
