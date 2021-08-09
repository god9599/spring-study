package Stream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOperationExam {
    public static void main(String[] args) {
        // 요소 출력
        Stream<String> stream = Stream.of("하나", "둘", "셋", "넷");
        stream.forEach(s -> System.out.print(s + " "));

        // 요소 소모
        Stream<String> stream1 = Stream.of("넷", "둘", "셋", "하나");
        Stream<String> stream2 = Stream.of("넷", "둘", "셋", "하나");

        Optional<String> result = stream1.reduce((s1, s2) -> s1 + "++" + s2);
        result.ifPresent(System.out::println);
        String result1 = stream2.reduce("시작", (s1, s2) -> s1 + "++" + s2);
        System.out.println(result1);

        // 요소 검색
        IntStream stream3 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
        IntStream stream4 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
        OptionalInt result2 = stream3.sorted().findFirst();
        OptionalInt result3 = stream4.sorted().findAny(); // 병렬 스트림인 경우 findAny() 메서드를 사용해야만 정확한 연산 결과 반환
        System.out.println(result2.getAsInt());

        // 요소 검사
        /*1. anyMatch() : 해당 스트림의 일부 요소가 특정 조건을 만족할 경우에 true를 반환함.
        2. allMatch() : 해당 스트림의 모든 요소가 특정 조건을 만족할 경우에 true를 반환함.
        3. noneMatch() : 해당 스트림의 모든 요소가 특정 조건을 만족하지 않을 경우에 true를 반환함.*/
        IntStream stream5 = IntStream.of(30, 90, 70, 10);
        IntStream stream6 = IntStream.of(30, 90, 70, 10);
        System.out.println(stream5.anyMatch(n -> n > 80));
        System.out.println(stream6.allMatch(n -> n > 80));
    }
}
