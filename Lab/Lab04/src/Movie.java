/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-02
/// Lab04-5 : 쇼핑몰 구매 시뮬레이션(4)

// Movie 클래스 생성 - Item 상속
public class Movie extends Item {
    // Movie 추가 필드 생성
    String director;

    // Movie 생성자 생성
    public Movie(String name, int price, String director) {
        super(name, price);
        this.director = director;
    }

    // Movie 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "Movie: " + name + " - " + director + "(" + price + "원)";
    }
}
