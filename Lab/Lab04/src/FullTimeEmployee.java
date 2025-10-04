/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-02
/// Lab04-1 : 직원 관리 시스템(2)

// FullTimeEmployee 클래스 생성 - Employee 상속
public class FullTimeEmployee extends Employee {
    // FullTimeEmployee 추가 필드 생성
    private double monthlySalary;

    // FullTimeEmployee 생성자 생성
    public FullTimeEmployee(String name, String department, double monthlySalary) {
        super(name, department);
        this.monthlySalary = monthlySalary;
    }

    // Employee 클래스의 calculatePay() 메소드를 오버라이딩
    @Override
    public double calculatePay() {
        return monthlySalary;
    }

    // FullTimeEmployee 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "[정규직] 이름: " + name + ", 부서: " + department + ", 월급: " + monthlySalary + "원";
    }
}
