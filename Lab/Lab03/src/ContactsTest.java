/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-09-25
/// Lab03-2 : ContactsTest 클래스 작성

import java.util.Scanner;

// ContactsTest 클래스 생성
public class ContactsTest {
    public static void main(String[] args) {
        // 입력 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // Contacts 객체를 저장할 배열 생성 (최대 10개)
        Contacts[] contacts = new Contacts[10];

        System.out.println("연락처를 입력하시오.(종료하려면 -1 입력)");

        // Contacts 정보를 입력받기 위한 반복문 생성
        while(true) {
            // Contacts 정보 입력받기
            System.out.print("이름 전화번호 이메일 입력: ");
            String line = sc.nextLine();

            // "-1"을 입력받으면 반복문 종료
            if (line.equals("-1")) {
                break;
            }

            // 공백으로 문자열 분리
            String[] parts = line.split(" ");
            String name = parts[0]; // name은 인덱스 0에 저장
            String tel = parts[1]; // tel은 인덱스 1에 저장
            String email = parts[2]; // email은 인덱스 2에 저장

            // 입력받은 정보로 Contacts 객체 생성 후 배열에 저장
            contacts[Contacts.getCount()] = new Contacts(name, tel, email);
        }
        // 총 생성된 지인(연락처) 수 출력
        System.out.println("지인들의 수는 " + Contacts.getCount() + "입니다.");

        // 사용자로부터 검색할 이름 입력받기
        System.out.print("검색할 이름 입력: ");
        String searchName = sc.nextLine();

        // 반복문을 사용해 배열에 저장된 Contacts에서 이름 검색
        for (int i = 0; i < Contacts.getCount(); i++) {
            // 배열의 연락처 이름과 입력한 이름을 비교해 일치하는 연락처 출력
            if(contacts[i].getName().equals(searchName)) {
                System.out.println(contacts[i]);
                break; // 일치하면 반복문 종료
            }
        }
        sc.close();
    }
}
