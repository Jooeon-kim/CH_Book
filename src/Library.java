import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Library {
    BookList bookList = new BookList();
    List<Book> mBookList = new ArrayList<>();
    CH02_RentalBook RB =new CH02_RentalBook(bookList);
    CH02_RentalDate RD;
    Scanner input = new Scanner(System.in);
    public Library() {

    }

    void run() {
        while (true){
            boolean start = RB.searchBook(); //여기서 exit 입력되면 불리언값 false 준다음 리턴
            if (!start){ //리턴받은 boolean 값에 따라 종료와 다음상황 이어짐
                break;
            }
        }


    }
}
