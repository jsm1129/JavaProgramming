/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-16
/// Lab06-1(2) : Object 클래스

// BookTest 클래스 생성
public class BookTest {
    // 두 Book 객체 비교 메소드
    public static void test(Book b1, Book b2) {
        // 두 객체가 동일한 책인지 비교
        if (b1.equals(b2))
            System.out.println(b1 + "와 " + b2 + "는 동일한 책입니다.");
        else
            System.out.println(b1 + "와 " + b2 + "는 다른 책입니다.");
    }

    // main 메소드
    public static void main(String[] args) {
        // Book 객체 생성
        Book b1 = new Book("자바", "저자A", 23000);
        Book b2 = new Book("자바", "저자A", 25000);
        Book b3 = new Book("자바", "저자C", 33000);
        Book b4 = new Book("파이썬", "저자A", 33000);

        // Book 객체 비교 테스트
        test(b1, b2);
        test(b2, b3);
        test(b1, b4);
    }
}
