/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-16
/// Lab06-3 : String 클래스 - split() 메소드 사용

import java.util.Scanner;

// StringSplitTest 클래스 생성
public class StringSplitTest {
    public static void main(String[] args) {
        // 입력 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String sentence = sc.nextLine(); // 한줄 전체 입력받기

        // 입력받은 문장을 공백 기준으로 분리
        String[] words = sentence.split(" ");

        // 분리된 단어들을 "/"로 연결하려 출력
        String output = String.join(" / ", words);
        System.out.println(output);

        // 단어 개수 출력
        System.out.println("단어 개수: " + words.length);
    }
}
