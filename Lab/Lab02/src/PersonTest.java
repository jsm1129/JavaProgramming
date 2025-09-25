/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-09-18
/// Lab02-1 : PersonTest 클래스 작성

// PersonTest 클래스 생성
public class PersonTest {
    public static void main(String[] args) {
        // Person 객체 생성
        Person p1 = new Person("Kim", "010-1111-2222", "02-111-2222", "abc1122@gamil.com");
        Person p2 = new Person("Lee", "010-3333-4444", "02-333-4444", "abc3344@gmail.com");
        Person p3 = new Person("Jeong", "010-5555-6666");

        // 객체 정보 출력
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
