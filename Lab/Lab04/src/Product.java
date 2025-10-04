/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-02
/// Lab04-3 : 쇼핑몰 관리 시스템(1)

// Product 클래스 생성
public class Product {
    // Product 필드 생성
    protected String name;
    protected double price;
    protected static int totalCount = 0;
    protected static double totalPrice = 0;

    // Product 생성자 생성
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        totalCount++;
        totalPrice += price;
    }

    // 상품 가격 계산 메소드
    public double getPrice() {
        return price;
    }

    // 정적 메소드 생성
    public static int getTotalCount() {
        return totalCount;
    }
    public static double getTotalPrice() {
        return totalPrice;
    }

    // Product 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "상품명: " + name + ", 가격: " + price + "원";
    }
}
