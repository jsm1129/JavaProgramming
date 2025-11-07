/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-11-06
/// Lab08-4 : 랜덤 위치에 숫자 생성

import javax.swing.*;
import java.awt.*;

// RandomNumberGUI 클래스 생성
public class RandomNumberGUI extends JFrame {
    public RandomNumberGUI() {
        setTitle("랜덤 위치에 숫자 생성"); // 프레임 제목
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 다딕 버튼 클릭 시 프로그램 종료
        setSize(500, 500); // 창 크기
        setLocationRelativeTo(null); // 화면 중앙에 창 표시
        setLayout(null); // 레이아웃 설정(null)

        // 라벨 배열 생성
        JLabel[] labels = new JLabel[30]; // 라벨 30개

        // 라벨에 번호 지정 및 위치 랜덤 배치
        for (int i = 0; i < labels.length; i++) {
            int x = (int)(Math.random() * 400) + 30; // x좌표
            int y = (int)(Math.random() * 400) + 30; // y좌표

            // 라벨 생성 및 텍스트 설정
            labels[i] = new JLabel(String.valueOf(i + 1)); // 라벨에 번호 표시
            labels[i].setFont(new Font("고딕", Font.BOLD, 15)); // 글꼴, 크기, 굵기
            labels[i].setHorizontalAlignment(SwingConstants.CENTER); // 중앙 정렬
            labels[i].setForeground(Color.BLACK); // 글자색

            // 라벨 위치와 크기 지정
            labels[i].setBounds(x, y, 40, 30);

            // 라벨 프레임에 추가
            add(labels[i]);
        }

        // 창 화면에 표시
        setVisible(true);
    }

    // 프로그램 실행
    public static void main(String[] args) {
        new RandomNumberGUI(); // GUI 창 실행
    }
}
