/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-11-13
/// Lab09-5: 간단한 사용자 정의 그림판

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

// SimplePaint 크래스 생성
public class SimplePaint extends JPanel {
    private ArrayList<Point> circles = new ArrayList<>(); // 원 위치 저장 배열

    public SimplePaint() {
        // 마우스 클릭 이벤트 등록
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                circles.add(e.getPoint()); // 클릭한 위치 저장
                repaint(); // 화면 다시 그리기
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // 배경 초기화
        g.setColor(Color.MAGENTA); // 원 색상
        // 저장된 위치마다 테두리 원 그리기
        for (Point p : circles) {
            g.drawOval(p.x-10, p.y-10, 20, 20);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("간단한 그림판"); // 프레임 제목
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 클릭 시 프로그램 종료
        frame.setSize(400, 400); // 창 크기
        frame.add(new SimplePaint()); // 패널 추가
        frame.setVisible(true); // 창 화면에 표시
    }
}
