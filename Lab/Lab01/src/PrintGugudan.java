/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-09-11
/// Lab01-2 : 구구단 출력

import java.util.Scanner;

public class PrintGugudan {
    public static void main(String[] args) {
        // 필요한 변수 선언
        int dan;

        // 입력을 위한 메시지 출력
        System.out.print("출력할 단을 입력하세요(2~9): ");

        // 사용자로부터 정수를 입력 받음
        Scanner sc = new Scanner(System.in);
        dan = sc.nextInt();

        // 입력 받은 값이 2~9 사이인지 확인
        if (dan < 2 || dan > 9){
            //범위를 벗어난 입력값일 경우 오류 메세지 출력
            System.out.println("잘못된 입력입니다. 2~9 사이의 정수를 입력하세요.");
        }
        else {
            System.out.println("=== " + dan + "단 ===");

            // 해당 단의 구구단을 1부터 9까지 출력
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " * " + i + " = " + (dan * i));
            }
        }
    }
}
