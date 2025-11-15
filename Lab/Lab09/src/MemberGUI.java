/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-11-13
/// Lab09-1 : 레이아웃 구성 실습

import javax.swing.*;
import java.awt.*;

// MemberGUI 클래스 생성
public class MemberGUI extends JFrame {
    public MemberGUI() {
        setTitle("회원정보 등록화면"); // 프레임 제목
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 클릭 시 프로그램 종료
        setSize(400, 300); // 창 크기
        setLocationRelativeTo(null); // 화면 중앙에 창 표시
        setLayout(new BorderLayout(5, 5)); // BorderLayout 사용

        // 상단 제목 라벨 영역
        JLabel label = new JLabel("회원 등록", SwingConstants.CENTER); // 가운데 정렬된 텍스트 라벨
        label.setFont(new Font("고딕",  Font.BOLD, 20)); // 글꼴, 크기, 굵기
        label.setPreferredSize(new Dimension(300, 50)); // 높이
        add(label, BorderLayout.NORTH); // 상단 영역에 추가

        // 왼쪽 항목 라벨 영역
        JPanel leftPanel = new JPanel(new GridLayout(0, 1, 5, 5)); // 세로 라벨 배치
        leftPanel.setPreferredSize(new Dimension(100, 200)); // 폭
        // 각 항목에 대한 라벨 추가
        leftPanel.add(new JLabel("아 이 디", SwingConstants.CENTER));
        leftPanel.add(new JLabel("비밀번호", SwingConstants.CENTER));
        leftPanel.add(new JLabel("이 메 일", SwingConstants.CENTER));
        leftPanel.add(new JLabel("전화번호", SwingConstants.CENTER));
        add(leftPanel, BorderLayout.WEST); // 왼쪽 영역에 추가

        // 중앙 입력 필드 영역
        JPanel centerPanel = new JPanel(new GridLayout(0, 1, 5, 5)); // 세로 입력창 배치
        // 입력 필드 생성
        JTextField tfId = new JTextField(10);
        JPasswordField tfPw = new JPasswordField(10);
        JTextField tfEmail = new JTextField(10);
        JTextField tfPhone = new JTextField(10);
        // 패널에 입력창 추가
        centerPanel.add(tfId);
        centerPanel.add(tfPw);
        centerPanel.add(tfEmail);
        centerPanel.add(tfPhone);
        add(centerPanel, BorderLayout.CENTER); // 중앙 영역에 추가

        // 하단 버튼 영역
        JPanel bottomPanel = new JPanel(new FlowLayout());
        JButton btnRegister = new JButton("등록하기");
        JButton btnCancel = new JButton("취소");
        // 버튼 추가
        bottomPanel.add(btnRegister);
        bottomPanel.add(btnCancel);
        add(bottomPanel, BorderLayout.SOUTH); // 하단 영역에 추가

        // 등록 버튼 이벤트
        btnRegister.addActionListener(e -> {
            String id = tfId.getText();
            String pw = new String(tfPw.getPassword());
            String email = tfEmail.getText();
            String phone = tfPhone.getText();
            // 콘솔 출력용
            System.out.println("아이디: " + id + ", 비밀번호: " + pw + ", 이메일: "  + email + "전화번호: " + phone + " 회원 등록 되었습니다.");
        });

        // 취소 버튼 이벤트
        btnCancel.addActionListener(e -> {
            tfId.setText("");
            tfPw.setText("");
            tfEmail.setText("");
            tfPhone.setText("");
        });

        // 창 화면에 표시
        setVisible(true);
    }

    // 프로그램 실행
    public static void main(String[] args) {
        new MemberGUI(); // GUI 창 실행
    }
}
