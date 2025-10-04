/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-02
/// Lab04-5 : 쇼핑몰 구매 시뮬레이션(2)

// Food 클래스 생성 - Item 상속
public class Food extends Item {
    // Food 추가 필드 생성
    public Food(String name, int price) {
        super(name, price);
    }

    // Food 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "Food: " + name + "(" + price + "원)";
    }
}
