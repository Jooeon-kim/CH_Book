public class Membership {
    private User currentUser;

    public Membership() {
        this.currentUser = LoginManager.getInstance().currentUser;
    }

    public void gradeStandard() {
        int totalPay = currentUser.getTotalPayed();
        if (totalPay > 100000) {
            currentUser.setGrade("Vip");
        } else if (totalPay > 50000) {
            currentUser.setGrade("Gold");
        } else if (totalPay > 0) {
            currentUser.setGrade("Silver");
        } else {
            currentUser.setGrade("Silver");
        }

        String grade = currentUser.getGrade();
        int discountRate = 0;

        switch (grade) {
            case "Vip":
                discountRate = 20;
                break;
            case "Gold":
                discountRate = 10;
                break;
            case "Silver":
                discountRate = 5;
                break;
            default:
                discountRate = 0;
                break;
        }

        int discountAmount = totalPay * discountRate / 100;
        int discountedPrice = totalPay - discountAmount;

        System.out.println("등급: " + grade);
        System.out.println("할인율: " + discountRate + "%");
        System.out.println("할인 금액: " + discountAmount + "원");
        System.out.println("최종 결제 금액: " + discountedPrice + "원");

    }
}


