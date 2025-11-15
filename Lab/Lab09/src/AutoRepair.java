/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-11-13
/// Lab09-4: 자동차 정비소 프로그램

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;

// AutoRepair 클래스 생성
public class AutoRepair extends JFrame {
    public AutoRepair() {
        setTitle("Auto Repair"); // 프레임 제목
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 클릭 시 프로그램 종료
        setSize(500, 300); // 창 크기
        setLocationRelativeTo(null); // 화면 중앙에 창 표시
        setLayout(new BorderLayout(10, 10)); // BorderLayout 사용

        // 자동차 수리 항목 (체크박스)
        JPanel optionPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); // 가운데 정렬
        // 체크박스 생성
        JCheckBox cb1 = new JCheckBox("엔진 오일 교환");
        JCheckBox cb2 = new JCheckBox("자동 변속기 오일 교환");
        JCheckBox cb3 = new JCheckBox("에어컨 필터 교환");
        JCheckBox cb4 = new JCheckBox("타이어 교환");
        // 패널에 체크박스 추가
        optionPanel.add(cb1);
        optionPanel.add(cb2);
        optionPanel.add(cb3);
        optionPanel.add(cb4);
        add(optionPanel, BorderLayout.NORTH); // 상단 패널에 추가

        // 가격 출력 영역
        JLabel center = new JLabel("현재까지의 가격은 0원 입니다.");
        center.setHorizontalAlignment(SwingConstants.CENTER);
        center.setFont(new Font("궁서", Font.BOLD,26)); // 폰트 설정
        add(center, BorderLayout.CENTER);

        // 각 수리 항목 가격
        int oil = 45000;
        int trans = 80000;
        int filter = 30000;
        int tire = 100000;

        // 체크박스 선택 이벤트 처리
        ItemListener listener = e -> {
            int totalPrice = 0; // 총 가격 변수 설정
            // 선택된 항목 가격 합산
            if(cb1.isSelected()) totalPrice += oil;
            if (cb2.isSelected()) totalPrice += trans;
            if (cb3.isSelected()) totalPrice += filter;
            if (cb4.isSelected()) totalPrice += tire;
            // 총 가격 출력
            center.setText("현재까지의 가격은 " + totalPrice + "원 입니다.");
        };

        // 이벤트 리스너 등록
        cb1.addItemListener(listener);
        cb2.addItemListener(listener);
        cb3.addItemListener(listener);
        cb4.addItemListener(listener);

        // 창 화면에 표시
        setVisible(true);
    }

    // 프로그램 실행
    public static void main(String[] args) {
        new AutoRepair(); // GUI 창 실행
    }
}
