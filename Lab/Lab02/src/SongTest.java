/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-09-18
/// Lab02-2 : SongTest 클래스 작성

// SongTest 클래스 생성
public class SongTest {
    public static void main(String[] args) {
        // Song 객체 생성
        Song s1 = new Song("Paradise", "Treasure", 180);
        Song s2 = new Song("No doubt", "enhypen");
        Song s3 = new Song("Attention");
        Song s4 = new Song();

        // 객체 정보 출력
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
