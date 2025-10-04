/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-02
/// Lab04-5 : 쇼핑몰 구매 시뮬레이션(3)

// Book 클래스 생성 - Item 상속
public class Book extends Item {
    // Book 추가 필드 생성
    String author;

    // Book 생성자 생성
    public Book(String name, int price, String author) {
        super(name, price);
        this.author = author;
    }

    // Book 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "Book: " + name + " - " + author + "(" + price + "원)";
    }
}
