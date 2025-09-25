/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-09-18
/// Lab02-4 : StudentTest 클래스 작성

import java.util.Scanner;

// StudentTest 클래스 생성
public class StudentTest {
    public static void main(String[] args) {
        // 입력 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // Student 정보 입력 받기
        System.out.print("학생의 이름: ");
        String name = sc.next();
        System.out.print("학번: ");
        String id = sc.next();
        System.out.print("나이: ");
        int age = sc.nextInt();

        // Student 객체 생성
        Student s = new Student(name, id, age);

        // 객체 정보 출력
        System.out.println(s);
    }
}
