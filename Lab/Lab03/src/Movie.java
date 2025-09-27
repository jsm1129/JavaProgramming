/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-09-25
/// Lab03-1 : Movie 클래스 작성

// Movie 클래스 생성
public class Movie {
    // Movie 필드 생성
    private String title;
    private String director;
    private static int count = 0;
    private int year;
    private int rate;

    // Movie 생성자 생성
    public Movie(String title, String director, int year, int rate){
        this.title = title;
        this.director = director;
        this.year = year;
        this.rate = rate;
        count++;
    }

    // 정적 메소드 생성
    public static int getCount() {
        return count;
    }

    // Movie의 정보를 문자열로 반환하는 메소드
    @Override
    public String toString(){
        return "영화 제목: " + title + ", 감독: " + director + ", 개봉 연도: " + year + ", 평점: " + rate;
    }
}
