/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-09-25
/// Lab03-2 : Contacts 클래스 작성

// Contacts 클래스 생성
public class Contacts {
    // Contacts 필드 생성
    private String name;
    private String tel;
    private String email;
    private static int count = 0;

    // Contacts 생성자 생성
    public Contacts(String name, String tel, String email) {
        this.name = name;
        this.tel = tel;
        this.email = email;
        count++;
    }

    // getter 메소드 생성 (Name)
    public String getName() {
        return name;
    }

    // 정적 메소드 생성
    public static int getCount() {
        return count;
    }

    // Contacts의 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "검색 결과: name: " + name + ", tel: " + tel + ", email: " + email;
    }
}
