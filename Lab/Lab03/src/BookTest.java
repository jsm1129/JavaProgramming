/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-09-25
/// Lab03-3 : BookTest 클래스 작성

import java.util.Scanner;

// BookTest 클래스 생성
public class BookTest {
    public static void main(String[] args) {
        // 입력 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // Book 객체를 저장할 배열 생성 (최대 10개)
        Book[] books = new Book[10];

        // Book 정보를 입력받기 위한 반복문 생성
        while (true) {
            // Book 정보 입력받기
            System.out.println("==============================");
            System.out.println("1. 책 등록");
            System.out.println("2. 책 검색");
            System.out.println("3. 모든 책 출력");
            System.out.println("4. 종료");
            System.out.println("==============================");
            System.out.print("메뉴 선택: ");

            // 사용자로부터 메뉴 선택 입력받기
            int menu = sc.nextInt();
            sc.nextLine();
            // 메뉴 "4"를 입력받으면 반복문 종료
            if (menu == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // switch 문을 사용해 메뉴에 따른 기능 수행
            switch (menu) {
                // 메뉴가 "1"이면 책 등록
                case 1:
                    System.out.print("책 제목: ");
                    String title = sc.nextLine();
                    System.out.print("책 평점: ");
                    int score = sc.nextInt();
                    sc.nextLine();
                    // 입력받은 정보로 Book 객체 생성 후 배열에 저장
                    books[Book.getCount()] = new Book(title, score);
                    break;
                // 메뉴가 "2"이면 책 검색
                case 2:
                    System.out.print("책 제목: ");
                    String searchTitle = sc.nextLine();
                    // 반복문을 사용해 배열에 저장된 Book 객체에서 책 제목 검색
                    for (int i = 0; i < Book.getCount(); i++) {
                        // 배열의 책 제목과 입력한 책 제목을 비교해 일치하는 책 정보 출력
                        if (books[i].getTitle().equals(searchTitle)) {
                            System.out.println(books[i]);
                            break;
                        }
                    }
                    break;
                // 메뉴가 "3"이면 모든 책 출력
                case 3:
                    for (int i = 0; i < Book.getCount(); i++) {
                        System.out.println(books[i]);
                    }
                    break;
            }
        }
    }
}
