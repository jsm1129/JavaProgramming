/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-02
/// Lab04-3 : 쇼핑몰 관리 시스템(2)

// CSBook 클래스 생성 - Product 상속
public class CSBook extends Product {
    // CSBook 추가 필드 생성
    private String author;
    private String publisher;
    private static int bookCount = 0;

    // CSBook 생성자 생성
    public CSBook(String name, double price, String author, String publisher) {
        super(name, price);
        this.author = author;
        this.publisher = publisher;
        bookCount++;
    }

    // 정적 메소드 생성
    public static int getBookCount() {
        return bookCount;
    }

    // CSBook 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "[도서] " + name + " (" + author + " 저, " + publisher + "), 가격: " + price + "원";
    }
}
