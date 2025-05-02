import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class CH02_RentalDate {
    List<Book> bookList;
    Book book;
    Scanner input = new Scanner(System.in);
    public CH02_RentalDate(Book book) {
        this.book = book;

    }
    void recordRentalDate(){ //LocalDae.now() 현재 시간 즉 빌려간 날짜
        LocalDate rentDate = LocalDate.now();
        int period = book.getDate();  // 예: 3
        LocalDate returnDate = rentDate.plusDays(period); //이건 빌려간 날짜에서 도서 대여일은 일단 전부 3일로 뒀기 때문에
        System.out.println("대여일: " + rentDate);         //현재 시간에서 기본대여일 추가 해서 5월1일날 빌렷으면 5월4일 반납
        System.out.println("대여 기간: " + period + "일");
        System.out.println("반납 예정일: " + returnDate);
    }

}
