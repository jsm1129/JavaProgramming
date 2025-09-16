/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-09-11
/// Lab01-1 : 자릿수별 숫자 비교

import java.util.Scanner;

public class NumberTest {
    public static void main(String[] args) {
        // 필요한 변수 선언
        int num, digitTens, digitOnes;

        // 입력을 위한 메시지 출력
        System.out.print("두 자리 수 정수 입력(10~99): ");

        // 사용자로부터 두 자리 정수를 입력 받음
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num < 10 || num > 99) {
            System.out.println("잘못된 입력입니다. 10~99 사이의 정수를 입력하세요.");
        }
        else {
            // 두 자리 수가 맞다면, 십의 자리와 일의 자리를 분리
            digitTens = num / 10;
            digitOnes = num % 10;

            // 판단 및 결과 출력
            if (digitTens == digitOnes) {
                System.out.println("십의 자리와 일의 자리가 같습니다.");
            }
            else {
                System.out.println("십의 자리와 일의 자리가 다릅니다.");
            }
        }
    }
}
