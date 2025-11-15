/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-11-13
/// Lab09-2 : 마우스 올리기 내리기 프로그램

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// MouseEventFrame 클래스 생성
public class MouseEventFrame extends JFrame {
    public MouseEventFrame() {
        setTitle("마우스 올리기 내리기"); // 프레임 제목
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 클릭 시 프로그램 종료
        setSize(400, 200); // 창 크기
        setLocationRelativeTo(null); // 화면 중앙에 창 표시
        setLayout(new BorderLayout()); // BorderLayout 사용

        // JLabel 생성
        JLabel label = new JLabel("사랑해", SwingConstants.CENTER); // 초기 문자열
        label.setFont(new Font("고딕", Font.BOLD, 15)); // 글꼴, 크기, 굵기
        add(label, BorderLayout.NORTH); // 상단 영역에 추가

        // 마우스 이벤트 리스너 등록
        label.addMouseListener(new MouseAdapter() {
            @Override
            // 마우스를 라벨 위로 올렸을 때 실행되는 메소드
            public void mouseEntered(MouseEvent e) {
                label.setText("I Love You"); // 문자열 -> 영어
            }

            // 마우스를 라벨에서 내렸을 때 실행되는 메소드
            public void mouseExited(MouseEvent e) {
                label.setText("사랑해"); // 문자열 -> 한글
            }
        });
        // 창 화면에 표시
        setVisible(true);
    }

    // 프로그램 실행
    public static void main(String[] args) {
        new MouseEventFrame(); // GUI 창 생성
    }
}
