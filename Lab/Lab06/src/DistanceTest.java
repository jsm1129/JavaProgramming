/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-16
/// Lab06-5 : Math 클래스

import java.util.Scanner;

// DistanceTest 클래스 생성
public class DistanceTest {
    public static void main(String[] args) {
        // 입력 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 시용자로부터 점 좌표 입력 받기
        System.out.print("점 A 좌표 입력(x y): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("점 B 좌표 입력(x y): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // 거리 계산
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // 결과 출력
        System.out.printf("두 점 사이의 거리: %.4f\n", distance);
    }
}
