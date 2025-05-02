import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Coupon {
    Scanner input = new Scanner(System.in);
    private User currentUser;
    HashMap<String, Integer> coupon = new HashMap<>();
    HashSet<String> usedCoupon = new HashSet<>();;

    public Coupon() {
        this.currentUser = LoginManager.getInstance().currentUser;
    }

    public void couponBook() {
        coupon.put("AAA0508", 10);
        coupon.put("BBB7542", 15);
        coupon.put("CCC3456", 20);
        coupon.put("DDD9987", 30);
        coupon.put("EEE2524", 50);

        System.out.println("쿠폰번호 7자리를 입력해 주세요.");
        String couponNum = input.nextLine();

        if (couponNum.length() != 7) {
            System.out.println("쿠폰 번호는 7자리여야 합니다.");
            System.out.println("최종 가격: " + currentUser.getTotalPayed() + "원 (할인 없음)");
            return;
        }

        if (usedCoupon.contains(couponNum)) {
            System.out.println("이미 사용한 쿠폰입니다. 다시 사용할 수 없습니다.");
            System.out.println("최종 가격: " + currentUser.getTotalPayed() + "원 (할인 없음)");
            return;
        }

        Integer discountRate = coupon.get(couponNum);

        if (discountRate != null) {
            int discountAmount = currentUser.getTotalPayed() * (discountRate / 100);
            int discountedPrice = currentUser.getTotalPayed() - discountAmount;
            System.out.println("쿠폰 할인율: " + discountRate + "%");
            System.out.println("할인 금액: " + discountAmount + "원");
            System.out.println("최종 결제 금액: " + discountedPrice + "원");
        } else {
            System.out.println("유효하지 않은 쿠폰입니다.");
            System.out.println("최종 가격: " + currentUser.getTotalPayed() + "원 (할인 없음)");

        }
    }
}

