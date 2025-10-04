/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-02
/// Lab04-2 : 직원 관리 시스템 확장

// EmployeeTest2 클래스 생성
public class EmployeeTest2 {
    public static void main(String[] args) {
        // Employee 객체를 저장할 배열 생성
        Employee[] employees = {
                new FullTimeEmployee("홍길동", "개발팀", 3000000),
                new PartTimeEmployee("김철수", "디자인팀", 20000, 80),
                new FullTimeEmployee("이영희", "인사팀", 2800000),
                new PartTimeEmployee("박민수", "영업팀", 25000, 100),
                new FullTimeEmployee("최지우", "기획팀", 3200000)
        };

        // 직원 급여 명단 출력
        System.out.println("===== 직원 급여 명단 =====");

        // 총 인건비 계산
        double totalPay = 0; // 총 인건비 계산을 위한 변수 선언
        // 배열에 저장된 직원 정보를 반복문을 사용하여 출력
        for (Employee e : employees) {
            System.out.println(e);
            // 이번 달 급여 출력
            double pay = e.calculatePay();
            System.out.println("이번 달 급여: " + pay + "원");
            totalPay += pay; // 총 금여 합산
            System.out.println("------------------------");
        }
        // 총 인건비 출력
        System.out.printf("총 인건비: %.1f원",  totalPay);
    }
}
