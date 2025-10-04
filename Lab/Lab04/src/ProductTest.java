/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-02
/// Lab04-3 : 쇼핑몰 관리 시스템(4)

// ProductTest 클래스 생성
public class ProductTest {
    public static void main(String[] args) {
        // Product 객체를 저장할 매열 생성
        Product[] products = new Product[6];

        products[0] = new CSBook("자바 프로그래밍", 25000, "이순신", "코딩출판사");
        products[1] = new CSBook("데이터베이스 개론", 30000, "김유신", "IT출판사");
        products[2] = new Electronics("노트북", 1200000, "삼성", 24);
        products[3] = new Electronics("스마트폰", 900000, "애플", 12);
        products[4] = new CSBook("알고리즘 문제해결", 28000, "강감찬", "AlgorithmBooks");
        products[5] = new Electronics("TV", 1500000, "LG", 36);

        // 전체 상품 출력
        System.out.println("===== 쇼핑몰 삼품 목록 =====");
        // 배열에 저장된 상품 정보를 반복문을 사용하여 출력
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
