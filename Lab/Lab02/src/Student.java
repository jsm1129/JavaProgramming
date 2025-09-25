/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-09-18
/// Lab02-4 : Student 클래스 작성

// Student 클래스 생성
public class Student {
    // Student 필드 생성
    private String name;
    private String id;
    private int age;

    // Student 생성자 생성
    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    // Student의 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "학생 정보 [이름 = " + name + ", 학번 = " + id + ", 나이 = " + age + "]";
    }
}
