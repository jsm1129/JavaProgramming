/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-09-25
/// Lab03-3 : Book 클래스 작성

// Book 클래스 생성
public class Book {
    // Book 필드 생성
    private String title;
    private int score;
    private static int count = 0;

    // Book 생성자 생성
    public Book(String title, int score) {
        this.title = title;
        this.score = score;
        count++;
    }

    // getter 메소드 생성 (Title)
    public String getTitle() {
        return title;
    }

    // 정적 메소드 생성
    public static int getCount() {
        return count;
    }

    // Book의 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "Book [Title: " + title + ", Score: " + score + "]";
    }
}
