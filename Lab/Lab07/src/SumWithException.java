/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-30
/// Lab07-1 : 문자열 예외처리

import java.util.Scanner;

// SumWithException 클래스 생성
public class SumWithException {
    public static void main(String[] args) {
        // 입력 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        System.out.print("여러 개의 정수 입력: ");
        String input = sc.nextLine();

        // 공백 기준으로 문자열을 나누어 배열에 저장
        String[] numbers = input.split(" ");

        int sum = 0; // 합계를 저장할 변수 초기화
        // 반복문ㅇ르 사용하여 numbers 배열의 각 원소를 순회하면서 정수 변환
        for (String number : numbers) {
            try {
                // 문자열을 정수로 변환하고 합계에 더함
                sum += Integer.parseInt(number);
            } catch (NumberFormatException e) {
                // 정수로 변환할 수 없는 경우 예외 발생
                System.out.println("NumberFormatException 정수로 변환할 수 없는 값: " + e.getMessage());
            }
        }
        // 합계 출력
        System.out.println("합계: " + sum);
    }
}
