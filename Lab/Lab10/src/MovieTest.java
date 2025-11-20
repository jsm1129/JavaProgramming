/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-11-20
/// Lab10-3 : 영화 정보 프로그램(2)

import java.util.ArrayList;
import java.util.Scanner;

// MovieTest 클래스 생성
public class MovieTest {
    public static void main(String[] args) {
        // 영화 정보를 저장할 ArrayLis<Movie> 생성
        ArrayList<Movie> list = new ArrayList<>();
        // 입력 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        int menu = 0; // 메뉴 선택 변수

        // 반복문을 사용하여 메뉴가 6(종료)일 때까지 반복
        while(menu != 6) {
            System.out.println("============영화 정보 관리============");
            System.out.println("1.입력/2.출력/3.검색/4.수정/5.삭제/6.종료");
            System.out.print("메뉴 선택: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                // 1. 영화 정보 입력
                case 1:
                    System.out.print("제목: ");
                    String title = sc.nextLine();
                    System.out.print("감독: ");
                    String director = sc.nextLine();
                    System.out.print("장르: ");
                    String genre = sc.nextLine();
                    System.out.print("년도: ");
                    int year = sc.nextInt();

                    // 새로운 Movie 객체를 ArrayList에 추가
                    list.add(new Movie(title, director, genre, year));
                    System.out.println("등록되었습니다.");
                    System.out.println();
                    break;

                // 2. 영화 정보 출력
                case 2:
                    System.out.println("[제목 | 감독 | 장르 | 년도]");
                    if (list.isEmpty()) {
                        System.out.println("등록된 영화가 없습니다.");
                    } else {
                        // ArrayList에 저장된 모든 영화 출력
                        for (Movie m : list) {
                            System.out.println(m);
                        }
                    }
                    System.out.println();
                    break;

                // 3. 영화 정보 검색
                case 3:
                    System.out.print("검색할 영화 제목: ");
                    String searchTitle = sc.nextLine();

                    // 반복문을 사용하여 제목과 일치하는 영화 출력
                    for (Movie m : list) {
                        if (m.getTitle().equals(searchTitle)) {
                            System.out.println(m);
                            break;
                        }
                    }
                    System.out.println();
                    break;

                // 4. 영화 정보 수정
                case 4:
                    System.out.print("수정할 영화 제목: ");
                    String updateTitle = sc.nextLine();
                    System.out.println("빈칸(Enter) 입력 시 기존 값 유지");

                    // 수정할 영화 찾기
                    Movie target = null;
                    for (Movie m : list) {
                        if (m.getTitle().equals(updateTitle)) {
                            target = m;
                            break;
                        }
                    }
                    // 수정할 영화가 존재하는 경우
                    if (target != null) {
                        System.out.print("새 제목(" + target.getTitle() + "): ");
                        String newTitle = sc.nextLine();
                        if (!newTitle.isEmpty()) target.setTitle(newTitle);
                        System.out.print("새 감독(" + target.getDirector() + "): ");
                        String newDirector = sc.nextLine();
                        if (!newDirector.isEmpty()) target.setDirector(newDirector);
                        System.out.print("새 장르(" + target.getGenre() + "): ");
                        String newGenre = sc.nextLine();
                        if (!newGenre.isEmpty()) target.setGenre(newGenre);
                        System.out.print("새 년도(" + target.getYear() + "): ");
                        String yearStr = sc.nextLine();
                        if (!yearStr.isEmpty()) target.setYear(Integer.parseInt(yearStr));

                        System.out.println("수정 완료: " + target);
                    } else {
                        // 수정할 영화가 존재하지 않는 경우
                        System.out.println("해당 영화가 존재하지 않습니다.");
                    }
                    System.out.println();
                    break;

                // 5. 영화 정보 삭제
                case 5:
                    System.out.print("삭제할 영화 제목: ");
                    String deleteTitle = sc.nextLine();

                    // 제목과 일치하는 영화를 찾아 삭제
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getTitle().equals(deleteTitle)) {
                            list.remove(i);
                            System.out.println("삭제 완료: " + deleteTitle);
                            break;
                        }
                    }
                    System.out.println();
                    break;

                // 6. 종료
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    break;
            }
        }
    }
}
