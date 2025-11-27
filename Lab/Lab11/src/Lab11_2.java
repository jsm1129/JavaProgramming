/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-11-27
/// Lab11-2 : Predicate/Function/Consumer 활용

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lab11_2 {
    public static void main(String[] args) {
        // 정수 리스트 생성
        List<Integer> nums = Arrays.asList(1, 4, 6, 7, 9, 12, 15);

        // 실습 2-1. 홀수만 출력 (Predicate 사용)
        Predicate<Integer> isOdd = n -> n % 2 != 0; // n이 홀수이면 true

        System.out.println("홀수만 출력:");
        // nums 리스트에서 스트림 생성
        nums.stream()
                .filter(isOdd) // 홀수만 필터링
                .forEach(System.out::println);

        // 실습 2-2. "값: x" 형태 문자열 리스트 생성 (Function 사용)
        Function<Integer, String> toLabeledString = n -> "값: " + n; // 정수 n을 받아 문자열로 변환
        // 스트림을 통해 Function을 적용하여 새로운 문자열 리스틑 생성
        List<String> labeled = nums.stream()
                .map(toLabeledString) // 정수를 문자열로 변환
                .toList(); // 리스트로 수집

        // 실습 2-3. Consumer로 결과 출력
        Consumer<String> print = s -> System.out.println(s);

        System.out.println("\n라벨된 문자열:");
        labeled.forEach(print); // 문자열 출력
    }
}
