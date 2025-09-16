/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-09-11
/// Lab01-6 : 숫자 추측 게임

import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        // 필요한 변수 선언
        int guess;
        int count = 0;

        // 컴퓨터 난수 생성
        int target = (int)(Math.random() * 100) + 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("=== 숫자 맞추기 게임 (1~100) ===");

        // 반복문 내에서
        while (true) {
            // 입력을 위한 메세지 출력
            System.out.print("숫자를 입력하세요: ");

            // 사용자로부터 입력
            guess = sc.nextInt();
            count++;

            // 정답이 맞으면 반복문 빠져나가기
            if (guess == target) {
                break;
            }
            // 정답이 맞지 않으면 비교 후 적절한 메세지 출력
            else if (guess > target) {
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                System.out.println("더 큰 수를 입력하세요.");
            }
        }
        // 축하 메세지와 시도 횟수 출력
        System.out.println("정답입니다! 시도 횟수: " + count);
    }
}
