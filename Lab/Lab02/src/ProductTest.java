/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-09-18
/// Lab02-3 : 쇼핑몰 상품 할인 계산

// ProductTest 클래스 생성
public class ProductTest {
    // Product 객체 생성
    public static void main(String[] args) {
        Product p1 = new Product("노트북", 2000000, 0.15);
        Product p2 = new Product("스마트폰", 1000000, 0.20);
        Product p3 = new Product("스마트워치", 700000, 0.30);

        // 객체 정보 출력
        System.out.println(p1 + ", 할인 가격: " + p1.getDiscountPrice());
        System.out.println(p2 + ", 할인 가격: " + p2.getDiscountPrice());
        System.out.println(p3 + ", 할인 가격: " + p3.getDiscountPrice());
    }
}
