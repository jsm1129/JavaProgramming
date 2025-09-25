/// 작성자 : 정수민(2416419)
/// 작성일 : 2025-09-18
/// Lab02-5 : BankAccount 클래스 작성

// BankAccount 클래스 생성
public class BankAccount {
    // BankAccount 필드 생성
    private String owner;          // 계좌 소유주
    private String accountNumber;  // 계좌 번호
    private double balance;        // 잔액

    // BankAccount 생성자 생성
    public BankAccount(String owner, String accountNumber, double balance) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // 입금 메소드
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입금되었습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println("입금 금액은 0보다 커야 합니다.");
        }
    }

    // 출금 메수드
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println("잔액 부족 또는 잘못된 금액입니다.");
        }
    }

    // 잔액 조회 메소드
    public double getBalance() {
        return balance;
    }

    // 계좌 정보 출력 메소드
    public void showAccountInfo() {
        System.out.println(this.toString());
    }

    // 계좌 이체 메소드
    public void transfer(BankAccount target, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);   // 출금
            target.deposit(amount);  // 입금
        } else {
            System.out.println("계좌 이체 실패");
        }
    }

    // BankAccount의 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "[" + accountNumber + "(" + owner + ")]님의 잔액: " + balance;
    }
}
