package Stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExam {
    public static void main(String[] args) {
        // 가변 매개변수를 전달 받아 스트림 생성
        Stream<Double> stream = Stream.of(4.2, 3.8, 2.2, 1.3);
        stream.forEach(System.out::println);

        // 지정된 범위의 연속된 정수 스트림 생성, 명시된 시작 정수 포함 & 마지막 정수 포함 안함
        IntStream stream1 = IntStream.range(1, 4);
        stream1.forEach(e -> System.out.print(e + " "));
        System.out.println();
        // 시작 정수 & 마지막 정수 포함
        IntStream stream2 = IntStream.rangeClosed(1, 4);
        stream2.forEach(e -> System.out.print(e + " "));

        // 특정 타입의 난수로 이루어진 스트림 생성
        IntStream stream3 = new Random().ints(4); // 매개변수를 전달받지않으면 무한 스트림을 반환. limit()으로 스트림의 크기 제한해야함.
        stream3.forEach(System.out::println);

        // 빈 스트림
        Stream<Object> stream4 = Stream.empty();
        System.out.println(stream4.count());
    }
}
