/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-16
/// Lab06-2 : String 클래스

import java.util.*;
import java.time.*;

// StringTest 클래스 생성
public class StringTest {
    public static void main(String[] args) {
        // 입력 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        System.out.print("주민등록번호를 입력하세요 (예: 901010-1234567): ");
        String input = sc.nextLine(); // 한줄 전체를 문자열로 입력받음(nextLine() 사용)
        input = input.trim(); // 공백 제거

        // 생년월일 추출 (문자열 추출 함수(substring), Wrapper 클래스 메소드(Integer.parseInt) 활용)
        String birth = input.substring(0, 6);
        int year = Integer.parseInt(birth.substring(0, 2));
        int month = Integer.parseInt(birth.substring(2, 4));
        int day = Integer.parseInt(birth.substring(4, 6));

        // 성별 추출
        String genderCode = input.substring(7, 8);
        int code = Integer.parseInt(genderCode);
        // 성별 콩드에 따라 앞 2자리 채우기
        if (code == 1 || code == 2) {
            year += 1900;
        } else if (code == 3 || code == 4) {
            year += 2000;
        }

        // 성별 판별(홀수-남자 / 짝수-여자)
        String gender = (code % 2 == 1) ? "남자" : "여자";

        // 추출된 년, 월, 일로 LocalDate 객체 생성
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now(); // 오늘 날짜
        int age = Period.between(birthDate, today).getYears(); // 나이 계산

        // 결과 출력
        System.out.printf("생년월일: %04d-%02d-%02d, 성별: %s, 나이: %d세\n", year, month, day, gender, age);
    }
}
