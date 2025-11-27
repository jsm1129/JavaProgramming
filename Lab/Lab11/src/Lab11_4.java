/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-11-27
/// Lab11-4 : Stream API 실습(2)

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lab11_4 {
    public static void main(String[] args) {
        // Product 겍체들을 저장할 문자열 리스트 셍성
        List<Product> list = Arrays.asList(
                new Product("노트북", "전자제품", 1200000),
                new Product("마우스", "전자제품", 25000),
                new Product("키보드", "전자제품", 45000),
                new Product("과자", "식품", 3000),
                new Product("커피", "식품", 3500),
                new Product("티셔츠", "의류", 29000),
                new Product("코트", "의류", 350000),
                new Product("청바지", "의류", 53000),
                new Product("모니터", "전자제품", 300000)
        );

        // 1) 50,000원 이상 상품 이름 출력
        System.out.println("1) 50,000원 이상 상품 이름");
        // 리스트에서 스트림 생성
        list.stream()
                .filter(p -> p.getPrice() >= 50000) // 가격이 50000원 이상인 상품만 필터링
                .map(Product::getName) // 상품 객체에서 이름만 추출
                .forEach(System.out::println); // 이름 출력

        // 2) 카테고리별 평균 가격 출력
        System.out.println("\n2) 카테고리별 평균 가격");
        // groupingBy (카테고리, 해당 그룹의 평균 계산)
        Map<String, Double> avgMap = list.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory, // 카테고리 기준 그룹화
                        Collectors.averagingInt(Product::getPrice) // 그룹 내 평균 가격 계산
                ));

        System.out.println(avgMap); // 상품 이름과 평균 가격 출력

        // 3) 가격 상위 3개 상품 출력
        System.out.println("\n3) 가격 상위 3개 상품");
        list.stream()
                .sorted((a, b) -> b.getPrice() - a.getPrice()) // 가격 기준 내림차순 정렬
                .limit(3) // 상위 3개만 선택
                .forEach(p -> System.out.println(p.getName() + "(" + p.getCategory() + ", " + p.getPrice() + "원)"));

        // 4) 카테고리별 상품 개수 출력
        System.out.println("\n4) 카테고리별 상품 개수");
        // groupingBy (카테고리, 해당 그룹의 개수)
        Map<String, Long> countMap = list.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory, // 카테고리 기준 그룹화
                        Collectors.counting() // 각 그룹 개수 세기
                ));
        System.out.println(countMap); // 상품 이름과 개수 출력
    }
}
