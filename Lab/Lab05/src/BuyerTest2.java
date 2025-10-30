/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-09
/// Lab05-4 : 쇼핑몰 구매 테스트 클래스

import java.util.*;

// BuyerTest2 클래스 생성
public class BuyerTest2 {
    public static void main(String[] args) {
        // 입력 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 시작 금액 입력
        System.out.print("보유 금액을 입력하세요: ");
        int money = sc.nextInt();
        Buyer buyer = new Buyer(money);

        // Item 객체를 저장할 배열 생성
        Item[] items = {
                new Food("비빔밥", 9000),
                new Food("라면", 6000),
                new Food("김밥", 5000),
                new Book("자바야 놀자", 20000, "오라클"),
                new Movie("케이팝데몬헌터스", 15000, "매기 강")
        };

        // 상품 목록과 할인 가격 출력
        System.out.println("======= 상품 목록 (할인 적용 가격) ======== ");
        for(Item i: items){
            Discountable d = (Discountable) i;
            System.out.println(i + "-> 할인 가격: "+(int)d.getDiscountPrice()+"원");
        }

        // 구매 시도
        System.out.println("====== 구매 시도 ======");
        for(Item i: items){
            buyer.buy(i, 1);
            System.out.println("--------------------");
        }

        // 가격 순으로 정렬
        System.out.println("===== 가격 순 정렬 (기본가 기준) =====");
        Arrays.sort(items, new Comparator<Item>(){
            @Override
            public int compare(Item o1, Item o2) {
                return o1.price - o2.price;
            }
        });
        // 정렬 후 상품 목록 출력
        for(Item i: items){
            System.out.println(i);
        }
    }
}
