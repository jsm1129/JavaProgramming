/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-10-16
/// Lab06-4 : Random 클래스

import java.util.Arrays;
import java.util.Random;

// LottoTest 클래스 생성
public class LottoTest {
    public static void main(String[] args) {
        // 랜덤 객체 생성
        Random rand = new Random();

        // 로또 번호를 저장할 배열
        int[] lotto = new int[6];

        // 반복문을 사용하여 로또번호 생성및 중복 번호 체크
        for (int i = 0; i < lotto.length; i++) {
            while (true) {
                int num = rand.nextInt(45) + 1; // 1~45 사이의 난수 생성
                boolean duplicate = false; // 중복 여부 확인 변수

                // 중복된 번호가 있는지 확인
                for ( int j = 0; j < i; j++) {
                    if(lotto[j] == num) { // 이전에 나온 번호와 같으면 중복 처리
                        duplicate = true;
                        break;
                    }
                }
                // 중복이 아니면 배열에 저장하고 반복문 종료
                if(!duplicate) {
                    lotto[i] = num;
                    break;
                }
            }
        }
        // 오름차순 정렬
        Arrays.sort(lotto);

        // 로또 번호 출력
        System.out.print("로또 번호: [ ");
        for (int i = 0; i < lotto.length; i++) {
            if (i < lotto.length - 1)
                System.out.print(lotto[i] + ", ");
            else
                System.out.print(lotto[i]);
        }
        System.out.println(" ]");
    }
}
