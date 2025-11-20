/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-11-20
/// Lab10-3 : 영화 정보 프로그램(1)

// Movie 클래스 생성
public class Movie {
    // Movie 필드 생성
    private String title;
    private String director;
    private String genre;
    private int year;

    // Movie 생성자 생성
    public Movie(String title, String director, String genre, int year) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.year = year;
    }

    // Getter 메소드
    public String getTitle() {
        return title;
    }
    public String getDirector() {
        return director;
    }
    public String getGenre() {
        return genre;
    }
    public int getYear() {
        return year;
    }

    // Setter 메소드
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setYear(int year) {
        this.year = year;
    }

    // Movie 정보를 문자열로 반환하는 메소드
    public String toString() {
        return title + " | " + director + " | " + genre + " | " + year;
    }
}
