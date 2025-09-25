/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-09-18
/// Lab02-2 : Song 클래스 작성

// Song 클래스 생성
public class Song {
    // Song 필드 생성
    private String title;
    private String artist;
    private int length;

    // Song 생성자 생성
    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    // 노래 제목, 가수 생성자 초기화 후 곡 길이는 0
    public Song(String title, String artist) {
        this(title, artist, 0);
    }

    // 노래 제목 생성자 초기화 후 가수는 정보 없음, 곡 길이는 0
    public Song(String title) {
        this(title, "정보 없음", 0);
    }

    // 노래 제목은 제목 없음, 가수는 정보 없음, 곡 길이는 0
    public Song() {
        this("제목 없음", "정보 없음", 0);
    }

    // Song의 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "Song [제목: " + title + ", 가수: " + artist + ", 곡의 길이: " + length + "]";
    }
}
