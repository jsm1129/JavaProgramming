/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-02
/// Lab04-5 : 쇼핑몰 구매 시뮬레이션(1)

// Item 클래스 생성
public class Item {
    // Item 필드 생성
    String name;
    int price;

    // Item 생성자 생성
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Item 어보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return name + "(" +  price + ")";
    }
}
