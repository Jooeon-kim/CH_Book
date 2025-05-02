import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class MarketManager {

    Scanner sc = new Scanner(System.in);
   List<Book> books = new ArrayList<>();
    User currentUser;
    public MarketManager(User user){
        this.currentUser = user;
        BookList list=new BookList();
        this.books=list.getBooks();
    }
    void run() {

        userSelect();

    }


    void userSelect() {
        while (true) {
            System.out.println("""
                    북마켓에 오신것을 환영합니다!
                    숫자로 선택해주세요
                    1. 책 검색
                    2. 장바구니 확인
                    3. 영수증 출력
                    4. 결제
                    """);
            int select = 0;
            try {
                select = sc.nextInt();
            } catch (Exception e) {
                System.out.println("숫자를 입력해주세여");
                sc.nextLine();
            }

            switch (select) {
                case 1:
                    SearchBook();
                    break;
                case 2:
                    cartList();
                    break;
                case 3:
                    showBill();
                    break;
                case 4:
                    payment();
                    break;
            }
        }
    }
    //------------------------------책찾는 메서드들------------------------------------
    void SearchBook(){
        System.out.println("""
                검색하실 카테고리를 선택해주세요
                1.책 이름
                2.저자
                3.분류
                4.가격순
                """);
        int choice  = sc.nextInt();
        switch (choice){
            case 1:
                findBook();
                break;
            case 2:
                findAuthor();
                break;
            case 3:
                findCategory();
                break;
            case 4:
                sortingPrice();
                break;
        }
    }




    // 검색할 책을 찾는 함수입니다
    public void findBook() {
        System.out.println("책이름을 입력해주세요");
        sc.nextLine();
        String bookName= sc.nextLine();
        boolean found=false;
        for(Book book:books){
            if(book.getTitle().equals(bookName)){
                System.out.println(book);
                found=true;
                System.out.println("장바구니에 추가하시겠습니까? Y|N");
                String input=sc.nextLine();
                if(input.toUpperCase().equals("Y")){
                    this.currentUser.getCartList().add(book);
                    System.out.println("장바구니에 추가되었습니다");
                }else if(input.toUpperCase().equals("N")){
                    System.out.println("장바구니에 추가되지 않았습니다");
                }else {
                    System.out.println("잘못입력하셨습니다 다시 입력해주세요");
                }
            }
        }
        if(!found){
            System.out.println("책을 찾을수 없습니다");

        }


    }
    public void findAuthor(){
        System.out.println("작성자를 입력해주세요");
        sc.nextLine();
        String bookName= sc.nextLine();
        boolean found=false;
        for(Book book:books){
            if(book.getAuthor().equals(bookName)){
                System.out.println(book);
                found=true;
                System.out.println("장바구니에 추가하시겠습니까? Y|N");
                String input=sc.nextLine();
                if(input.toUpperCase().equals("Y")){
                    this.currentUser.getCartList().add(book);
                    System.out.println("장바구니에 추가되었습니다");
                }else if(input.toUpperCase().equals("N")){
                    System.out.println("장바구니에 추가되지 않았습니다");
                }else {
                    System.out.println("잘못입력하셨습니다 다시 입력해주세요");
                }
            }
        }
        if(!found){
            System.out.println("작성자를 찾을수 없습니다");

        }
    }

    public void findCategory(){
        System.out.println("카테고리를 입력해주세요");
        sc.nextLine();
        String bookName= sc.nextLine();
        boolean found=false;
        for(Book book:books){
            if(book.getCategory().equals(bookName)){
                System.out.println(book);
                found=true;
                System.out.println("장바구니에 추가하시겠습니까? Y|N");
                String input=sc.nextLine();
                if(input.toUpperCase().equals("Y")){
                    this.currentUser.getCartList().add(book);
                    System.out.println("장바구니에 추가되었습니다");
                }else if(input.toUpperCase().equals("N")){
                    System.out.println("장바구니에 추가되지 않았습니다");
                }else {
                    System.out.println("잘못입력하셨습니다 다시 입력해주세요");
                }
            }
        }
        if(!found){
            System.out.println("검색한 카테고리를 찾을수 없습니다");

        }
    }
    public void sortingPrice() {

        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return Integer.compare(book1.getPrice(), book2.getPrice());
            }
        });


        System.out.println("가격순으로 정렬된 책 목록:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    //------------------------현제 장바구니 리스트입니다----------
    void cartList(){
        if(this.currentUser.getCartList().isEmpty()){
            System.out.println("장바구니가 비어있습니다");
        }else {
            System.out.println("장바구니에 담긴 목록입니다");
            for(Book book:this.currentUser.getCartList()){
                System.out.println(book);
            }
        }
    }
    //--------------------영수증 출력하는 메서드---------
    void showBill(){
        if(this.currentUser.getCartList().isEmpty()){
            System.out.println("장바구니가 비어있습니다");
        }else {
            System.out.println("영수증");
            int total=0;
            for(Book book:this.currentUser.getCartList()){
                System.out.println(book);
                total =total + book.getPrice();
            }
            System.out.println("총금액은"+total+"원");
        }
    }
    //------------------결제하는 메서드--------------------
    void payment(){
        if(this.currentUser.getCartList().isEmpty()){
            System.out.println("장바구니가 비어있습니다 결제를 할수없습니다");
        }else {
            int total=0;
            for(Book book:this.currentUser.getCartList()){
                total=total+book.getPrice();
            }
            System.out.println("총결제 금액은"+total);
            System.out.println("결제를 진행하겠습니까 Y|N");
            sc.nextLine();
            String input=sc.nextLine();
            if(input.toUpperCase().equals("Y")){
                System.out.println("결제가 완료되었습니다");
                this.currentUser.getCartList().clear();
            } else if (input.toUpperCase().equals("N")) {
                System.out.println("결제가 취소되었습니다");
            }else {
                System.out.println("잘못입력하셨습니다");
            }
        }
    }
}