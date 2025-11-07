/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-11-06
/// Lab08-3 : 배치 관리자 없이 배치하는 실습

import javax.swing.*;
import java.awt.*;

// StoryTest 클래스 생성
public class StoryTest extends JFrame {
    public StoryTest() {
        setTitle("SM Story"); // 프레임 제목
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 클릭 시 프로그램 종료
        setSize(400, 300); // 창 크기
        setLocationRelativeTo(null); // 화면 중앙에 창 표시
        setLayout(null); // 레이아웃 설정(null)

        // 라벨 및 텍스트 필드
        // 제목 라벨
        JLabel label1 = new JLabel("SM Story"); // 텍스트
        label1.setFont(new Font("고딕",  Font.BOLD, 20)); // 글꼴, 크기, 굵기
        label1.setBounds(50, 50, 100, 30); // 위치
        add(label1); // 프레임에 추가

        // 시작 부분 라벨
        JLabel label2 = new JLabel("가을은"); // 텍스트
        label2.setFont(new Font("고딕",  Font.BOLD, 20)); // 글꼴, 크기, 굵기
        label2.setBounds(100, 100, 100, 30); // 위치
        add(label2); // 프레임에 추가

        // 끝 부분 라벨
        JLabel label3 = new JLabel("이다"); // 텍스트
        label3.setFont(new Font("고딕",  Font.BOLD, 20)); // 글꼴, 크기, 굵기
        label3.setBounds(200, 200, 100, 30); // 위치
        add(label3); // 프레임에 추가

        // 텍스트 필드
        JTextField textField = new JTextField(); // 텍스트 입력할 수 있는 입력창
        textField.setFont(new Font("고딕", Font.BOLD, 20)); // 글꼴, 크기, 굵기
        textField.setBounds(150, 150, 200, 30); // 위치
        add(textField); // 프레임에 추가

        // 창 화면에 표시
        setVisible(true);
    }

    // 프로그램 실행
    public static void main(String[] args) {
        new StoryTest(); // GUI 창 실행
    }
}
