import java.util.Scanner;

public class Payment {
    private User currentUser;
    Scanner input = new Scanner(System.in);
    Membership mb = new Membership();
    Coupon cp = new Coupon();

    public Payment() {
        this.currentUser = LoginManager.getInstance().currentUser;
    }

    public void finalPayment() {
        System.out.println("쿠폰을 사용하시겠습니까? < 예 / 아니오 >");
        String yn = input.nextLine();

        if (yn.equals("예")) {
            cp.couponBook();
        } else if (yn.equals("아니오")) {
            mb.gradeStandard();
        }
    }
}
