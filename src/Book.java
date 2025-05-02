public class Book {
    String isbn;
    String title;
    int date;
    String author;
    String description;
    String category;
    String publishDate;
    int amount;

    public Book(String isbn, String title, int date, String author, String description,
                String category, String publishDate, int amount){
        this.isbn = isbn;
        this.title = title;
        this.date = date;
        this.author = author;
        this.description = description;
        this.category = category;
        this.publishDate = publishDate;
        this.amount = amount;
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
}
