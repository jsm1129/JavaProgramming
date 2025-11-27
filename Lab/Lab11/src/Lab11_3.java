/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-11-27
/// Lab11-3 : Stream API 실습(1)

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lab11_3 {
    public static void main(String[] args) {
        // 문자열 리스트 생성
        List<String> list = Arrays.asList("Kim", "Park", "He", "I", "Lee", "Hello", "World");

        // Stream을 사용하여 문자열 처리 후 리스트 변환
        List<String> result = list.stream()
                .filter(s -> s.length() >= 3) // 문자열 길이가 3 이상인 요소만 필터링
                .map(String::toUpperCase) // 대문자 변환
                .collect(Collectors.toList()); // 변환된 결과를 새로운 리스트로 저장

        System.out.println(result);
    }
}
