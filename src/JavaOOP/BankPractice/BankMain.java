package JavaOOP.BankPractice;
/* static 멤버와 메서드는 클래스 생성 시 함께 생성되고, 객체가 생성 시 만들어지지 않음
*  하나의 클래스에 한개만 존재하며,
*  한번 생성되면 프로그램 종료까지 사라지지 않는다
*  정적(static)메서드 에서는 인스턴스 필드나 메서드를 사용 할 수 없음 */
public class BankMain {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오뱅크", 1000);
        Bank shinhan = new Bank("신한은행", 1000);
        Bank Kookmin = new Bank("국민은행", 1000);
        Bank kakao2 = new Bank("카카오뱅크",0);
        kakao.setDeposit(3000);
        kakao.setWithdraw(2000);
        System.out.println(kakao.getBank() + "에 " + kakao.getAccount() + " (원) 이 있습니다.");
        System.out.println("계좌가 " + Bank.getCount() + " 개 개설 되었습니다.");

        System.out.println(Utilities.max(100, 200));    // Utilities 클래스 내의 A 와 B중 더 큰 수를 반환
        System.out.println(Utilities.isEven(120));      // Utilities 클래스 내의 Number 값이 짝수인지?
        System.out.println(Utilities.getCurrentDate("yyyyMMdd"));
    }
}
