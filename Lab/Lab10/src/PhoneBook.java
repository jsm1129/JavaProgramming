/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-11-20
/// Lab10-2 : HashMap 활용 예제

import javax.swing.*;
import java.util.HashMap;
import java.util.Scanner;

// PhoneBook 클래스 생성
public class PhoneBook {
    public static void main(String[] args) {
        // HashMap 생성
        HashMap<String, String> map = new HashMap<String, String>();

        // 초기 데이터 저장
        map.put("홍길동", "010-1234-5678");
        map.put("이몽룡", "010-2345-6789");
        map.put("성춘향", "010-3456-7890");

        // 입력 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 이름 입력받기
        System.out.print("검색할 이름을 입력하세요: ");
        String name = sc.nextLine();

        // HashMap에서 이름 검색
        if(map.containsKey(name)){
            // 존재할 경우
            System.out.println("전화번호: " + map.get(name));
        } else {
            // 존재하지 않을 경우
            System.out.println("등록되지 않은 이름입니다.");
        }
    }
}
