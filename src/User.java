import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String pw;
    private String name;
    private String address;
    private String phone;
    private String grade;
    private int point;
    private int totalPayed;
    List<Book> CartList = new ArrayList<>();

    public User(String id, String pw, String name, String address, String phone, String grade, int point, int totalPayed) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.grade = grade;
        this.point = point;
        this.totalPayed = 0;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTotalPayed() {
        return totalPayed;
    }

    public void setTotalPayed(int totalPayed) {
        this.totalPayed = totalPayed;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public List<Book> getCartList() {
        return CartList;
    }
}
