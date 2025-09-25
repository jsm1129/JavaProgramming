/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-09-18
/// Lab02-3 : 쇼핑몰 상품 할인 계산

// Product 클래스 생성
public class Product {
    // Product 필드 생성
    private String name;
    private int price;
    private double discountRate;

    // Product 생성자 생성
    public Product(String name, int price, double discountRate) {
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
    }

    // 할인된 가격 반환
    public int getDiscountPrice() {
        return (int)(price * (1 - discountRate));
    }

    // Product의 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "상품명: " + name + ", 정가: " + price + "원, 할인율: " + discountRate;
    }
}
