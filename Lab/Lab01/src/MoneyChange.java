/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-09-11
/// Lab01-4 : 동전 변환 예제

import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args) {
        // 환산할 돈의 단위 배열 선언
        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};

        // 입력을 위한 메세지 출력
        System.out.print("금액을 입력하세요: ");

        // 사용자로부터 돈을 입력 받기
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        // 반복문을 사용하여 각 단위별로 몇 장 인지 계산
        for (int i = 0; i < unit.length; i++) {
            int count = money / unit[i];
            money = money % unit[i];

            // 지폐와 동전을 구분하여 결과 출력
            if (unit[i] >= 1000) {
                System.out.println(unit[i] + "원권: " + count + "장");
            }
            else {
                System.out.println(unit[i] + "원: " + count + "개");
            }
        }
    }
}
