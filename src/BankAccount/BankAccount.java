class BankAccount {

    // 멤버변수
    int bankCode;               // 은행 코드
    int accountNo;              // 계좌 번호
    String owner;               // 예금주
    int balance;                // 잔액
    boolean isDormant;          // 휴면계좌 여부
    int password;               // 비밀번호

    // 메서드(함수)
    void inquiry() { }          // 계좌 조회
    void deposit() { }          // 계좌 입금
    void heldInDormant() { }    // 휴면계좌 전환

    // 기본 생성자
    BankAccount() {
        // 인스턴시 생성시 수행할 명령
        // 인스턴스의 멤버변수 초깃값 설정
    }

    // 기본 생성자
    BankAccount(int bankCode, int accountNo, String owner, int balance, int password) {
        this.bankCode = bankCode;
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
        this.password = password;
        this.isDormant = false;
    }
}

class savingsAccount extends BankAccount implements Withdrawable {      // 자유입출금통장

    boolean isOverdraft;        // 마이너스 통장 여부
    public void withdraw() { }  // 예금 인출 - 인터페이스 구현부
    void transfer() { }         // 계좌 송금
}

class subscriptionAccount extends BankAccount { // 청약통장

    int numOfSubscription;      // 납입횟수
}

class dollarAccount extends BankAccount implements Withdrawable {       // 달러입출금통장

    void inquiry(double currencyRate) { }       // 오버로딩
    public void withdraw() { }                  // 예금 인출 - 인터페이스 구현부
    void deposit() { }                          // 계좌 입금 - 오버라이딩
    void transfer() { }                         // 계좌 송금
}