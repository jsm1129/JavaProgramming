/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-30
/// Lab07-2 : 알파벳 문자 빈도수 체크, 예외처리

import java.util.Scanner;

// AlphabetFrequency 클래스 생성
public class AlphabetFrequency {
    public static void main(String[] args) {
        // 입력 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String input = sc.nextLine(); // 한줄 전체 입력받기

        // 알파벳 개수(26)에 해당하는 배열 생성
        int[] freq = new int[26]; // 각 인덱스는 'A'~'Z'의 빈도를 저장

        // 반복문을 사용하여 입력된 문자열을 한 글자씩 순회
        for (int i = 0; i < input.length(); i++) {
            // 문자를 대문자로 변환
            char ch = Character.toUpperCase(input.charAt(i));

            try {
                // 'A'를 기준으로 인덱스 계산
                int index = ch - 'A';
                freq[index]++; // 해당 알파벳 빈도 1 증가
            } catch (ArrayIndexOutOfBoundsException e) {
                // 알파벳이 아닌 문자가 들어올 경우 index가 0~25 범위를 벗어나므로 예외 발생
                System.out.println("[ArrayIndexOutOfBoundsException]");
            }
        }
        // 빈도가 1 이상인 알파벳만 출력
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0)
                System.out.print((char) ('A' + i) + ":" + freq[i] + " ");
        }
    }
}
