/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-11-13
/// Lab09-3: 문자열 회전 프로그램

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

// MoveStringFrame 클래스 생성
public class MoveStringFrame extends JFrame {
    public MoveStringFrame() {
        setTitle("마우스 문자열 회전"); // 프레임 제목
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 클릭 시 프로그램 종료
        setSize(400, 200); // 창 크기
        setLocationRelativeTo(null); // 화면 중앙에 창 표시

        // 초기 문자열
        String text = "I Love you ";

        // JLabel 생성
        JLabel label = new JLabel(text, SwingConstants.CENTER); // 초기 문자열
        label.setFont(new Font("고딕", Font.BOLD, 15)); // 글꼴, 크기, 굵기
        add(label, BorderLayout.NORTH); // 상단 영역에 추가

        // KeyAdapter를 이용하여 키 입력 처리
        addKeyListener(new KeyAdapter() {
            String str = text; // 회전시킬 문자열 저장

            @Override
            public void keyPressed(KeyEvent e) {
                // 왼쪽 화살표 키 입력
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    String first = str.substring(0, 1); // 첫 글자
                    String rest = str.substring(1); // 나머지 문자열
                    str = rest.concat(first); // rest 뒤에 first를 붙여서 문자열을 한 칸 왼쪽으로 회전
                    label.setText(str); // 변경된 문자열을 라벨에 다시 출력
                }
            }
        });
        // 창 화면에 표시
        setVisible(true);
    }

    // 프로그램 실행
    public static void main(String[] args) {
        new MoveStringFrame(); // GUI 창 실행
    }
}
