/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-11-27
/// Lab11-1 : 람다식 작성

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lab11_1 {
    public static void main(String[] args) {

        // 실습 1-1 : 익명 클래스 → 람다식
        Comparator<Integer> comp = (a, b) -> a - b;
        System.out.println(comp.compare(10, 20));


        // 실습 1-2, 1-3에서 사용할 문자열 리스트
        List<String> list = Arrays.asList("a", "ccc", "bb");

        // 실습 1-2 : 문자열 길이 기준 정렬(람다식  Comparator 사용)
        list.sort((o1, o2) -> o1.length() - o2.length());

        // 실습 1-3 : 문자열 각각 출력(forEach의 Consumer 람다식 사용)
        list.forEach(System.out::println);
    }
}
