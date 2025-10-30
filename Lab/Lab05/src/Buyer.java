/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-09
/// Lab05-4 : 쇼핑몰 구매 시뮬레이션 코드 수정

// Item 추상 클래스 생성
abstract class Item {
    // Item 필드 생성
    String name;
    int price;

    // Item 생성자 생성
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Item 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return name + "(" +  price + ")";
    }
}

// Discountable 인터페이스 생성
interface Discountable {
    double getDiscountPrice(); // 추상 메소드
}

// Book 클래스 생성 - Item 추상 클래스 상속, Discountable 인터페이스 구현
class Book extends Item implements Discountable {
    // Book 추가 필드 생성
    String author;

    // Book 생성자 생성
    public Book(String name, int price, String author) {
        super(name, price);
        this.author = author;
    }

    // Discountable 인터페이스의 getDiscountPrice() 메소드 오버라이딩
    @Override
    public double getDiscountPrice() {
        return price * 0.9; // 10% 할인
    }

    // Book 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "Book: " + name + " - " + author + "(" + price + "원)";
    }
}

// Food 클래스 생성 - Item 추상 클래스 상속, Discountable 인터페이스 구현
class Food extends Item implements Discountable {
    // Food 추가 필드 생성
    public Food(String name, int price) {
        super(name, price);
    }

    // Discountable 인터페이스의 getDiscountPrice() 메소드 오버라이딩
    @Override
    public double getDiscountPrice() {
        return price * 0.95; // 5% 할인
    }

    // Food 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "Food: " + name + "(" +  price + "원)";
    }
}

// Movie 클래스 생성 - Item 추상 클래스 상속, Discountable 인터페이스 구현
class Movie extends Item implements Discountable {
    // Movie 추가 필드 생성
    String director;

    // Movie 생성자 생성
    public Movie(String name, int price, String director) {
        super(name, price);
        this.director = director;
    }

    // Discountable 인터페이스의 getDiscountPrice() 메소드 오버라이딩
    @Override
    public double getDiscountPrice() {
        return price * 0.8; // 20% 할인
    }

    // Movie 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "Movie: " + name + " - " + director + "(" + price + "원)";
    }
}

// Buyer 클래스 생성
public class Buyer {
    // Buyer 필드 생성
    private int money;

    // Buyer 생성자 생성
    public Buyer(int money) {
        this.money = money;
    }

    // 상품 총액 계산 메소드
    public void buy(Item t, int n) {
        // 할인된 가격 게산
        Discountable d = (Discountable) t;
        double total = d.getDiscountPrice() * n;

        // 구매 가능 여부 확인
        if (money >= total) {
            money -= total;
            // 구매 성공 시
            System.out.println("구매 성공: " + t + " => " + n + "개 구매");
            System.out.println("남은 잔액: " + money + "원");
        } else {
            // 구매 실패 시
            System.out.println("잔액 부족! " + t + " 구매 불가");
            System.out.println("현재 잔액: " + money + "원");
        }
    }
}
