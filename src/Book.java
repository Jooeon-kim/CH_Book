public class Book {
    String isbn;
    String title;
    int date;
    String author;
    String description;
    String category;
    String publishDate;
    int amount;
    int price;

    public Book(String isbn, String title, int date, String author, String description,
                String category, String publishDate, int amount,int price){
        this.isbn = isbn;
        this.title = title;
        this.date = date;
        this.author = author;
        this.description = description;
        this.category = category;
        this.publishDate = publishDate;
        this.amount = amount;
        this.price=price;
    }
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getAmount() {
        return amount;
    }

    public int getDate() {
        return date;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public  int getPrice(){return  price; }

    public void setPrice(int price){this.price=price;}



    @Override
    public String toString() {
        return String.format(
                "책 제목: %s\n저자: %s\n출판일: %s\nISBN: %s\n카테고리: %s\n설명: %s\n가격: %d원\n남은 수량: %d권",
                title, author, publishDate, isbn, category, description, price, amount
        );
    }


}
