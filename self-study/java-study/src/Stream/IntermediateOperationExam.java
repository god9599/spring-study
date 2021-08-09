package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperationExam {
    public static void main(String[] args) {
        // stream filtering
        IntStream stream = IntStream.of(1, 1, 2, 2, 3, 4, 5, 5, 6);
        IntStream stream1 = IntStream.of(1, 1, 2, 2, 3, 4, 5, 5, 6);

        stream.distinct().forEach(e -> System.out.print(e + " ")); // 중복 요소 제거
        stream1.filter(n -> n % 2 != 0).forEach(e -> System.out.print(e + " ")); // 홀수만을 골라냄

        // stream change
        Stream<String> stream2 = Stream.of("wow", "lol", "damn", "kimchi");
        stream2.map(s -> s.length()).forEach(System.out::println); // 스트림의 요소를 인수로 전달하여, 그 반환값들로 이루어진 새로운 스트림 반환

        String[] arr = {"I study hard", "You study JAVA", "I am hungry"};
        Stream<String> stream3 = Arrays.stream(arr);
        stream3.flatMap(s -> Stream.of(s.split(" "))).forEach(System.out::println); // 저장된 배열을 각 문자열에 포함된 단어로 이루어진 스트림으로 변환

        // stream limit
        IntStream stream4 = IntStream.range(0, 10);
        IntStream stream5 = IntStream.range(0, 10);
        IntStream stream6 = IntStream.range(0, 10);
        stream4.limit(5).forEach(n -> System.out.print(n + " "));
        stream5.skip(3).forEach(n -> System.out.print(n + " "));
        stream6.skip(3).limit(5).forEach(n -> System.out.print(n+ " "));

        // stream sorted
        Stream<String> stream7 = Stream.of("wow", "lol", "damn", "kimchi");
        Stream<String> stream8 = Stream.of("wow", "lol", "damn", "kimchi");
        stream7.sorted().forEach(s -> System.out.print(s + " ")); // 비교자가 안주어지면 디포트로 사전 순 정렬
        stream8.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " ")); // 사전 역순으로 정렬

        // 스트림 연산 결과 확인(원본 스트림 요소를 소모하지 않음, 연산과 연산 사이 결과 확인 용도)
        IntStream stream9 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        stream9.peek(s -> System.out.println("원본 스트림 : " + s))
                .skip(2)
                .peek(s -> System.out.println("skip(2) 실행 후 : " + s))
                .limit(5)
                .peek(s -> System.out.println("limit(5) 실행 후 : " + s))
                .sorted()
                .peek(s -> System.out.println("sorted() 실행 후 : " + s))
                .forEach(n -> System.out.println(n));
    }
}
