/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-11-06
/// Lab08-2 : 레이아웃 구성 실습

import javax.swing.*;
import java.awt.*;

// OrderGUI 클래스 생성
public class OrderGUI extends JFrame {
    public OrderGUI() {
        setTitle("커피 주문 화면"); // 프레임 제목
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 클릭 시 프로그램 종료
        setSize(400, 300); // 창 크기
        setLocationRelativeTo(null); // 화면 중앙에 창 표시
        setLayout(new BorderLayout(5, 5)); // BorderLayout 사용

        // 상단 제목 라벨 영역
        JLabel label = new JLabel("커피 주문", SwingConstants.CENTER); // 가운데 정렬된 텍스트 라벨
        label.setFont(new Font("고딕",  Font.BOLD, 20)); // 글꼴, 크기, 굵기
        label.setPreferredSize(new Dimension(300, 50)); // 높이
        add(label, BorderLayout.NORTH); // 상단 영역에 추가

        // 중앙 메인 패널
        JPanel mainPanel = new JPanel(new BorderLayout(5, 5)); // 왼쪽, 오른쪽 구성 패널
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); // 내부 여백

        // 왼쪽 항목 라벨 영역
        JPanel leftPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        // 각 항목에 대한 라벨 추가
        leftPanel.add(new JLabel("[커피 선택]", SwingConstants.CENTER));
        leftPanel.add(new JLabel("[옵션 선택]", SwingConstants.CENTER));
        leftPanel.add(new JLabel("[사이즈 선택]", SwingConstants.CENTER));

        // 오른쪽 선택 입력 영역
        JPanel rightPanel = new JPanel(new GridLayout(3, 1, 10, 10));

        // 커피 선택 영역 (콤보박스)
        JPanel coffeePanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); // 가운데 정렬
        String[] coffee = {"아메리카노", "카페라떼", "카푸치노"}; // 선택 항목 배열
        JComboBox<String> comboBox = new JComboBox<>(coffee); // 콤보박스 생성
        comboBox.setPreferredSize(new Dimension(250, 25)); // 크기
        coffeePanel.add(comboBox); // 콤보박스 추가
        rightPanel.add(coffeePanel); // 오른쪽 패널에 추가

        // 옵션 선택 영역 (체크박스)
        JPanel optionPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); // 가운데 정렬
        // 체크박스 생성
        JCheckBox cb1 = new JCheckBox("샷 추가");
        JCheckBox cb2 = new JCheckBox("시럽 추가");
        JCheckBox cb3 = new JCheckBox("휘핑 크림 추가");
        // 패널에 체크박스 추가
        optionPanel.add(cb1);
        optionPanel.add(cb2);
        optionPanel.add(cb3);
        rightPanel.add(optionPanel); // 오른쪽 패널에 추가

        // 사이즈 선택 영역 (라디오 버튼)
        JPanel sizePanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); // 가운데 정렬
        //라디오 버튼 생성
        JRadioButton r1 = new JRadioButton("regular");
        JRadioButton r2 = new JRadioButton("large");
        // 두 버튼 그룹화해 하나만 선택 가능
        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        // 패널에 라디오 버튼 추가
        sizePanel.add(r1);
        sizePanel.add(r2);
        rightPanel.add(sizePanel); // 오른쪽 패널에 추가

        // 왼쪽, 오른쪽 패널을 메인 패널에 추가
        mainPanel.add(leftPanel, BorderLayout.WEST); // 왼쪽 영역
        mainPanel.add(rightPanel, BorderLayout.CENTER); // 오른쪽 영역

        // 메인 패널 프레임 중앙 배치
        add(mainPanel, BorderLayout.CENTER);

        // 하단 버튼 영역
        JPanel bottomPanel = new JPanel();
        JButton orderBtn = new JButton("주문하기");
        JButton cancelBtn = new JButton("취소");
        // 버튼 추가
        bottomPanel.add(orderBtn);
        bottomPanel.add(cancelBtn);
        add(bottomPanel, BorderLayout.SOUTH); // 하단 영역에 추가

        // 창 화면에 표시
        setVisible(true);
    }

    // 프로그램 실행
    public static void main(String[] args) {
        new OrderGUI(); // GUI 창 실행
    }
}
