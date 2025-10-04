/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-02
/// Lab04-5 : 쇼핑몰 구매 시뮬레이션(6)

import java.util.Scanner;

// BuyerTest 클래스 생성
public class BuyerTest {
    public static void main(String[] args) {
        // 입력 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 시작 금액 입력
        System.out.print("보유 금액을 입력하세요: ");
        int money = sc.nextInt();
        Buyer buyer = new Buyer(money);

        // Item 객체를 저장할 배열 생성
        Item[] items = {
                new Food("비빔밥", 9000),
                new Food("라면", 6000),
                new Food("김밥", 5000),
                new Book("자바야 놀자", 20000, "오라클"),
                new Movie("케이팝데몬헌터스", 15000, "매기 강")
        };

        // 상품 번호를 입력받기 위한 반복문 생성
        while (true) {
            // 상품 목록 출력
            System.out.println("\n======== 상품 목록 ========");
            for (int i = 0; i < items.length; i++) {
                System.out.println((i) + ". " + items[i]);
            }
            System.out.println("-1. 종료");
            // 상품 번호 입력받기
            System.out.print("구매할 상품 번호를 입력하세요: ");
            int sel = sc.nextInt();

            // "-1"을 입력받으면 반복문 종료
            if (sel == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 구매 개수 입력
            System.out.print("구매할 개수를 입력하세요: ");
            int n = sc.nextInt();

            // 구입 진행
            buyer.buy(items[sel], n);

            System.out.println("--------------------------");
        }
        sc.close();
    }
}
