/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-09
/// Lab05-2 : 인터페이스 실습

import java.util.Iterator;

// CardDeck 클래스 생성 - Iterator 인터페이스 구현
class CardDeck implements Iterator {
    // 13장의 카드가 저장된 문자열 객체 배열 생성
    private String[] cards = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"
    };

    // 배열에서 현재 위치 추적을 위한 변수 선언 및 초기화
    private int index = 0;

    // Iterator 인터페이스의 hasNext() 메소드를 오버라이딩
    @Override
    public boolean hasNext() {
        return index < cards.length; // 현재 위치와 카드 배열의 길이 비교
    }

    // Iterator 인터페이스의 next() 메소드를 오버라이딩
    @Override
    public Object next() {
        if (hasNext()) {
            return cards[index++]; // 문자열 배열로부터 현재 위치의 값을 반환 후 현재 위치값 증가
        } else {
            return null; // 더 이상 카드가 없을 때
        }
    }

    // Iterator 인터페이스의 remove() 메소드를 오버라이딩
    @Override
    public void remove() { }
}

// IteratorTest 클래스 생성
public class IteratorTest {
    public static void main(String[] args) {
        // CardDeck 객체 생성
        CardDeck i = new CardDeck();
        // hasNext()가 true인 동안 반복하여 카드 출력
        while(i.hasNext()) {
            System.out.println("next()가 반환하는 값:" + i.next());
        }
    }
}
