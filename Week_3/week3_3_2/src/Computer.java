
public class Computer {

    // khai báo các thuộc tính của một computer
    // tạo tất cả các hàm dựng (có đối và không đối)
    // xây dựng các hàm getter, setter phù hợp với các thuộc tính
    //
    private String name;
    private String manu;
    private int year;
    private String detail;
    private double price;

    public Computer() {
    }

    public Computer(String name, String manu, int year, String detail, double price) {
        this.name = name;
        this.manu = manu;
        this.year = year;
        this.detail = detail;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManu() {
        return manu;
    }

    public void setManu(String manu) {
        this.manu = manu;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Hàm trả về một chuỗi thông tin của một máy tính, mỗi thuộc tính cách nhau một dấu cách
    @Override
    public String toString() {
        return this.name + " " + this.manu + " " + this.year + " " + this.detail + " " + this.price;
    }
}
