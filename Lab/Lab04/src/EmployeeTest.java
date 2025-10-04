/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-02
/// Lab04-1 : 직원 관리 시스템(4)

// EmployeeTest 클래스 생성
public class EmployeeTest {
    public static void main(String[] args) {
        // Employee 타입 변수 선언
        Employee e1, e2;

        // 각 Employee 객체 생성
        e1 = new FullTimeEmployee("홍길동", "개발팀", 3000000);
        e2 = new PartTimeEmployee("김철수", "디자인팀", 20000, 80);

        // 정규직 Employee 정보 출력
        System.out.println(e1);
        System.out.println("급여: " + e1.calculatePay());

        // 계약직 Employee 정보 출력
        System.out.println(e2);
        System.out.println("급여: " + e2.calculatePay());
    }
}
