/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-09-18
/// Lab02-5 : BankAccountTest 클래스 작성

import java.util.Scanner;

// BankAccountTest 클래스 생성
public class BankAccountTest {
    public static void main(String[] args) {
        // 입력 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // BankAccount 객체 배열 생성
        BankAccount ba[] = new BankAccount[5];

        // 계좌 정보 입력받을 변수 선언
        String name;
        String accountNumber;
        int balance;

        // 계좌 정보 입력받아 BankAccount 객체 생성
        for (int i = 0; i < 3; i++) {
            System.out.printf("[계좌 %d] 소유주: ", i);
            name = sc.next();
            System.out.printf("[계좌 %d] 계좌번호: ", i);
            accountNumber = sc.next();
            System.out.printf("[계좌 %d] 잔액: ", i);
            balance = sc.nextInt();
            ba[i] = new BankAccount(name, accountNumber, balance);
        }

        // 계좌 이체
        System.out.println("계좌 이체 0 ==> 2, 30000원 이체 실행");
        ba[0].transfer(ba[2], 30000);

        // 각 객체 정보 출력
        for (int i = 0; i < 3; i++)
            System.out.println(ba[i]);
    }
}
