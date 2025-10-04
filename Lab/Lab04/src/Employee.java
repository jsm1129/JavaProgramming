/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-02
/// Lab04-1 : 직원 관리 시스템(1)

// Employee 클래스 생성
public class Employee {
    // Employee 필드 생성
    protected String name;
    protected String department;

    // Employee 생성자 생성
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // 급여 계산 메소드
    public double calculatePay() {
        return 0.0;
    }

    // Employee 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "이름: " + name + ", 부서: " + department;
    }
}
