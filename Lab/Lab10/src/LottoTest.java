/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-11-20
/// Lab10-1 : HashSet 활용 예제

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Random;

// Lotto 클래스 생성
class Lotto {
    // HashSet 생성
    HashSet<Integer> set = new HashSet<Integer>();

    // 로또 번호 생성 메소드
    public void generate() {
        set.clear(); // 이전 번호가 있으면 비우기
        Random rand = new Random(); // 난수 생성기

        // Hashset 크기가 6이 될 때까지 반복하여 번호 생성
        while (set.size() < 6) {
            int num = rand.nextInt(45) + 1; // 1 ~ 45 사이 난수 생성
            set.add(num); // Hashset에 추가
        }
    }

    // 로또 번호를 문자열로 반환하는 메소드
    public String asString() {
        String result = "";
        int count = 0;
        // 반복문을 사용하여 HashSet에 저장된 번호들을 문자열에 추가
        for (int n : set) {
            result += n;
            count++;
            if (count < set.size()) {
                result += ", "; // 마지막 번호 ,(콤마) X
            }
        }
        return result; // 문자열 반환
    }
}

// LottoTest 클래스 생성
public class LottoTest extends JFrame {
    public LottoTest() {
        Lotto lotto = new Lotto(); // Lotto 객체 생성
        JButton btn = new JButton("로또 번호 생성"); // 버튼 생성
        JTextField tf = new JTextField(30); // 로또 번호 표시용 텍스트 필드

        // 버튼 클릭 이벤트
        btn.addActionListener(e -> {
            lotto.generate(); // 로또 번호 생성
            tf.setText(lotto.asString()); // 생성된 번호를 문자열로 반환하여 텍스트 필드에 출력
        });

        add(btn, "West"); // 왼쪽 버튼
        add(tf, "Center"); // 중앙 텍스트 필드

        pack(); // 창 크기 조정
        setTitle("로또 번호 생성기"); // 프레임 제목
        setVisible(true); // 창 화면에 표시
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 클릭 시 프로그램 종료
    }

    // 프로그램 실행
    public static void main(String[] args) {
        new LottoTest(); // GUI 창 생성
    }
}
