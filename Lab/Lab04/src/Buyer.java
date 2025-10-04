/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-02
/// Lab04-5 : 쇼핑몰 구매 시뮬레이션(5)

// Buyer 클래스 생성
public class Buyer {
    // Buyer 필드 생성
    private int money;

    // Buyer 생성자 생성
    public Buyer(int money) {
        this.money = money;
    }

    // 상품 총액 계산 메소드
    public void buy(Item t, int n) {
        int total = t.price * n;

        // 구매 가능 여부 확인
        if (money >= total) {
            money -= total;
            // 구매 성공 시
            System.out.println("구매 성공: " + t + " => " + n + "개 구매");
            System.out.println("남은 잔액: " + money + "원");
        } else {
            // 구매 실패 시
            System.out.println("잔액 부족! " + t + " 구매 불가");
            System.out.println("현재 잔액: " + money + "원");
        }
    }
}
