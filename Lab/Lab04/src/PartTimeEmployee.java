/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-02
/// Lab04-1 : 직원 관리 시스템(3)

// PartTimeEmployee 클래스 생성 - Employee 상속
public class PartTimeEmployee extends Employee {
    // PartTimeEmployee 추가 필드 생성
    double hourlyRate;
    int workHours;

    // PartTimeEmployee 생성자 생성
    PartTimeEmployee(String name, String department, double hourlyRate, int workHours) {
        super(name, department);
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
    }

    // Employee 클래스의 calculatePay() 메소드를 오버라이딩
    @Override
    public double calculatePay() {
        return  hourlyRate * workHours;
    }

    // PartTimeEmployee 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "[계약직] 이름: " + name + ", 부서: " + department + ", 시급: " + hourlyRate + ", 근무시간: " +  workHours + "시간";
    }
}
