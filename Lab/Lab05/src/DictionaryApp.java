/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-09
/// Lab05-3 : 추상 클래스 실습

// PairMap 추상 클새스 생성
abstract class PairMap {
    protected String keyArray[]; // key 저장하는 배열
    protected String valueArray[]; // value 저장하는 배열

    abstract public String get(String key); // key 값으로 value 검색
    abstract public void put(String key, String value); // key, value 저장
    abstract public String delete(String key); // key 값을 가진 아이템 삭제, 삭제된 value 리턴
    abstract public int length(); // 현재 저장된 아이템 개수 반환
}

// Dictionary 클래스 생성 - PairMap 상속
class Dictionary extends PairMap {
    private int count; // 현재 저장된 아이템 개수를 위한 변수 선언 및 초기화

    // Dictionary 생성자 생성
    public Dictionary(int capacity) {
        // capacity 만큼의 각 배열 생성
        keyArray = new String[capacity];
        valueArray = new String[capacity];
        count = 0;
    }

    // PairMap 추상 클래스의 get() 메소드를 오버라이딩
    @Override
    public String get(String key) {
        // 현재 저장된 원소 개수만큼 반복문을 사용하여 반복
        for (int i = 0; i < count; i++) {
            if (keyArray[i].equals(key)) { // key 배열에서 찾는 키와 같은 값이 있는지 검사
                return valueArray[i]; // 찾는 key가 있을 때
            }
        }
        return null; // 찾는 key가 없을 때
    }

    // PairMap 추상 클래스의 put() 메소드를 오버라이딩
    @Override
    public void put(String key, String value) {
        // 현재 저장된 원소 개수만큼 반복문을 사용하여 반복
        for (int i = 0; i < count; i++) {
            if (keyArray[i].equals(key)) { // 동일한 key가 이미 존재한다면
                valueArray[i] = value; // 그 위치에 value 값 저장
                return;
            }
        }
        // 동일한 key가 존재하지 않는다면 배열의 마지막 인덱스 뒤에 key, value 값 저장
        keyArray[count] = key;
        valueArray[count] = value;
        count++;
    }

    // PairMap 추상 클래스의 delete() 메소드를 오버라이딩
    @Override
    public String delete(String key) {
        // 현재 저장된 원소 개수만큼 반복문을 사용하여 반복
        for (int i = 0; i < count; i++) {
            if (keyArray[i].equals(key)) { // 동일한 key가 존재한다면
                String deletedValue = valueArray[i]; // 그 위치의 key, value 값 삭제
                // 삭제 후 뒤의 원소들을 앞으로 한칸씩 이동
                for (int j = i; j < count - 1; j++) {
                    keyArray[j] = keyArray[j + 1];
                    valueArray[j] = valueArray[j + 1];
                }
                keyArray[count - 1] = null;
                valueArray[count - 1] = null;
                count--;
                return deletedValue; // 삭제된 원소의 value 값 반환
            }
        }
        return null; // 찾는 key가 없을 때
    }

    // PairMap 추상 클래스의 length() 메소드를 오버라이딩
    @Override
    public int length() {
        return count; // 저장된 항목 개수 반환
    }
}

// DictionaryApp 클래스 생성
public class DictionaryApp {
    public static void main(String[] args) {
        // Dictionary 객체를 저장할 배열 생성
        Dictionary dic = new Dictionary(10);

        dic.put("apple", "사과");
        dic.put("banana", "바나나");
        dic.put("grape", "포도");

        System.out.println("banana → " + dic.get("banana")); // 바나나
        System.out.println("삭제된 값: " + dic.delete("apple")); // 사과
        System.out.println("apple → " + dic.get("apple")); // null
        System.out.println("현재 저장된 개수: " + dic.length()); // 2
    }
}

