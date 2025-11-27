/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-11-27
/// Lab11-4 : Stream API 실습(2)

// Product 클래스 생성
public class Product {
    // Product 필드 생성
    private String name;
    private String category;
    private int price;

    // Product 생성자 생성
    public Product(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getter 메소드
    public String getName() { return name; }
    public String getCategory() { return category; }
    public int getPrice() { return price; }

    // Product 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return String.format("%s %s %d", name, category, price);
    }
}
