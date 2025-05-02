import java.util.List;
import java.util.Scanner;

public class CH02_RentalBook {
    List<Book> bookList;
    Book book;
    Scanner input = new Scanner(System.in);

    public CH02_RentalBook(BookList bookList) {
        this.bookList = bookList.getBooks();
    }

    boolean searchBook() {
        System.out.println("찾으시는 도서 정보 종류를 입력해주세요");
        System.out.println("대여를 그만하시려면 exit를 입력하세요");
        System.out.println("[id, title, author, category, publishDate]");
        String searchType = input.nextLine();

        if (searchType.equals("exit")) {
            System.out.println("감사합니다. 안녕히 가세요!");
            return false;
        }
        System.out.print("도서 정보에서 키워드를 입력해주세요 : ");
        String keyword = input.nextLine().toUpperCase();
        boolean found = false; //switch case로 keyword를 찾아서 없으면 조건에 안맞고 다시돌림
        switch (searchType.toLowerCase()) {
            case "id":
                for (Book book : bookList) {
                    if (book.getIsbn().equalsIgnoreCase(keyword)) { // id를 대소문자 구분안하고 찾음
                        printBook(book); //책 정보 출력
                        found = true;
                    }
                }
                break;

            case "title":
                for (Book book : bookList) {
                    if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) { //입력된 값을 소문자로 찾음
                        printBook(book);
                        found = true;
                    }
                }
                break;

            case "author":
                for (Book book : bookList) {
                    if (book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {//입력된 값을 소문자로 찾음
                        printBook(book);
                        found = true;
                    }
                }
                break;

            case "category":
                for (Book book : bookList) {
                    if (book.getCategory().toLowerCase().contains(keyword.toLowerCase())) {//입력된 값을 소문자로 찾음
                        printBook(book);
                        found = true;
                    }
                }
                break;

            case "publishdate":
                for (Book book : bookList) {
                    if (book.getPublishDate().equals(keyword)) { //사실 이건 왜 넣은지 모름 그냥 출간일 찾는사람이 있을수도 있으니 넣음
                        printBook(book);
                        found = true;
                    }
                }
                break;

            default:
                System.out.println("※ 잘못된 검색 종류입니다.");
                break;

        }
        if (!found) {
            System.out.println("조건의 맞는 도서가 없습니다.");
        }
        rentalBook();
        return true;
    }

    void printBook(Book book) { // 위에 스위치 케이스 문에서 선택된 도서 정보를 출력
        System.out.println("  제목: " + book.getTitle());
        System.out.println("  저자: " + book.getAuthor());
        System.out.println("  ISBN: " + book.getIsbn());
        System.out.println("  카테고리: " + book.getCategory());
        System.out.println("  출판일: " + book.getPublishDate());
        System.out.println("  수량: " + book.getAmount());
        System.out.println("  설명: " + book.getDescription());
        System.out.println("  대여기간: " + book.getDate());
        this.book = book;
    }

    void rentalBook() { //Library에서 호출 위에 책 검색이 끝났으면 그책을 대여할지 체크
        System.out.println("선택 하신 도서를 대여 하시겠습니까? Y/N");
        String yn = input.nextLine();
        if (!yn.toUpperCase().equals("Y")) {
            System.out.println("대여를 하지 않아서 다시 돌아갑니다.");
            return;
        }
        if (book.getAmount() <= 0) { //amount가 없으면 대여 불가 이건 새 상품과 같이 카운트 할지 체크
            System.out.println("남은 재고가 없습니다.");
            return;
        }
        this.book.setAmount(this.book.getAmount() - 1); //빌려가면 amount -1
        System.out.println("도서를 대여 하셨습니다");
        CH02_RentalDate ch02_rentalDate = new CH02_RentalDate(book); //그리고 대여한 책의 기간을 알려줌
        ch02_rentalDate.recordRentalDate();
    }


}

