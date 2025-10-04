/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-02
/// Lab04-3 : 쇼핑몰 관리 시스템(3)

// Electronics 클래스 생성 - Product 상속
public class Electronics extends Product {
    // Electronics 추가 필드 생성
    private String manufacturer;
    private int warrantyMonths;
    private static int electronicsCount = 0;

    // Electronics 생성자 생섣
    public Electronics(String name, double price, String manufacturer, int warrantyMonths) {
        super(name, price);
        this.manufacturer = manufacturer;
        this.warrantyMonths = warrantyMonths;
        electronicsCount++;
    }

    // 정적 메소드 생성
    public static int getElectronicsCount() {
        return electronicsCount;
    }

    // Electronics 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "[전자제품] " + name + " (" + manufacturer +  "), 보증기간: " + warrantyMonths + "개월, 가격: " + price + "원";
    }
}
