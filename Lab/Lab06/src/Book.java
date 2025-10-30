/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-16
/// Lab06-1(1) : Object 클래스

// Book 클래스 생성
public class Book {
    // Book 필드 생성
    private String title;
    private String author;
    private int price;

    // Book 생성자 생성
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // equals 메소드 오버라이딩
    @Override
    public boolean equals(Object obj) {
        // obj가 Book 타입인지 확인
        if (obj instanceof Book) {
            Book b = (Book) obj; // 형변환
            return this.title.equals(b.title) && this.author.equals(b.author); // 제목과 저자가 모두 같으면 true 반환
        }
        return false; // Book 타입이 아니면 false 반환
    }

    // Book 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "[제목: " + title + ", 저자: " + author + ", 가격: " + price + "]";
    }
}
