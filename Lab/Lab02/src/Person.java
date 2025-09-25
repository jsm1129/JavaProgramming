/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-09-18
/// Lab02-1 : Person 클래스 작성

// Person 클래스 생성
public class Person {
    // Person 필드 생성
    private String name;
    private String mobile;
    private String office;
    private String email;

    // Person 생성자 생성
    public Person(String name, String mobile, String office, String email) {
        this.name = name;
        this.mobile = mobile;
        this.office = office;
        this.email = email;
    }

    // 이름, 휴대폰번호 생성자 초기화 후 나머지는 None
    public Person(String name, String mobile) {
        this(name, mobile, "None", "None");
    }

    // Person의 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "Person [name=" + name + ", mobile=" + mobile + ", office=" + office + ", email=" + email + "]";
    }
}
