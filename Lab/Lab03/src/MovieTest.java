/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-09-25
/// Lab03-1 : MovieTest 클래스 작성

import java.util.Scanner;

// MovieTest 클래스 생성
public class MovieTest {
    public static void main(String[] args) {
        // 입력 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // Movie 객체를 저장할 배열 생성 (최대 5개)
        Movie[] movies = new Movie[5];

        // Movie 정보를 입력받아 배열에 저장
        for (int i = 0; i < movies.length; i++) {
            System.out.println("------- 영화 정보 " + (i + 1) + " 입력 -------");

            System.out.print("제목: ");
            String name = sc.nextLine();

            System.out.print("감독: ");
            String director = sc.nextLine();

            System.out.print("개봉 연도: ");
            int year = sc.nextInt();
            sc.nextLine();

            System.out.print("평점: ");
            int rate = sc.nextInt();
            sc.nextLine();

            // 입력받은 정보로 Movie 객체 생성 후 배열에 저장
            movies[i] = new Movie(name, director, year, rate);
        }
        sc.close();

        // Movie 배열에 저장된 Movie 정보 출력
        for (int i = 0; i < Movie.getCount(); i++) {
            System.out.println("[" + (i + 1) + "] " + movies[i]);
        }
    }
}
