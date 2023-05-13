
import java.util.Scanner;

public class ComputerTest {

    private Computer computers[];
    private int n;

    // Hàm nhập vào số n và một mảng gồm thông tin của n máy tính
    public void input(Scanner scan)
    {
        int n = scan.nextInt();
        if (n <= 0) {
            throw new IllegalArgumentException("Input should be positive");
        }
        this.computers = new Computer[n];
        for (int i = 0; i < this.computers.length; i++) {
            scan.nextLine();
            this.computers[i] = new Computer();
            this.computers[i].setName(scan.nextLine());
            this.computers[i].setManu(scan.nextLine());
            this.computers[i].setYear(scan.nextInt());
            scan.nextLine();
            this.computers[i].setDetail(scan.nextLine());
            this.computers[i].setPrice(scan.nextDouble());
        }
    }

    // in ra các máy tính, mỗi thông tin của một máy tính trên một dòng
    public void output()
    {
        for (int i = 0; i <this.computers.length; i++) {
            System.out.println(this.computers[i].toString());
        }
    }

    // Trả về giá trung bình của các máy tính
    public double getAvgPrice()
    {
        double sum = 0.0d;
        for (int i = 0; i < this.computers.length; i++) {
            sum += this.computers[i].getPrice();
        }
        sum = sum/this.computers.length;
        return sum;
    }

    // In ra các máy tính có giá cao nhất
    public void getMaxPrice()
    {
        if (this.computers.length == 0) {
            return;
        }
        double max_price = this.computers[0].getPrice();
        for (int i = 1; i < this.computers.length; i++) {
            if (this.computers[i].getPrice() > max_price) {
                max_price = this.computers[i].getPrice();
            }
        }
        for (int i = 0; i < this.computers.length; i++) {
            if (this.computers[i].getPrice() == max_price) {
                System.out.println(this.computers[i].toString());
            }
        }
    }

    // In ra các máy tính có nhà sản xuất là Dell
    public void getDell()
    {
        for (int i = 0; i < this.computers.length; i++) {
            if (this.computers[i].getManu().equalsIgnoreCase("dell")) {
                System.out.println(this.computers[i].toString());
            }
        }
    }

    // Sắp xếp các máy tính theo chiều giảm dần của giá, và in ra mảng sau khi sắp xếp
    public void sort()
    {
        Computer temp_computer;
        for (int i = 0; i < this.computers.length - 1; i++) {
            for (int j = i + 1; j < this.computers.length; j++) {
                if (this.computers[j].getPrice() > this.computers[i].getPrice()) {
                    temp_computer = this.computers[i];
                    this.computers[i] = this.computers[j];
                    this.computers[j] = temp_computer;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ComputerTest computer_test = new ComputerTest();
        System.out.println("INPUT");
        computer_test.input(scan);
        System.out.println("OUTPUT");
        computer_test.output();
        System.out.println("AVERAGE PRICE: " + computer_test.getAvgPrice());
        System.out.print("MAX PRICE: ");
        computer_test.getMaxPrice();
        System.out.println("DELL");
        computer_test.getDell();
        System.out.println("SORT");
        computer_test.sort();
        computer_test.output();
    }

}
