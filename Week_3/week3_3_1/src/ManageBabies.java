
import java.io.IOException;
import java.util.Scanner;

public class ManageBabies {

	/*  Nhap vao thong tin cua n baby tu ban phim. Cac thong tin theo thu tu ten, ngay thang nam sinh, gioi tinh,
	can nang, chieu cao
	*/

    // nhap vao so nguyen duong n va thong tin cua n baby
        Baby[] createData (Scanner sc) {
//            int order = sc.nextInt();
            int n = sc.nextInt();
            if (n <= 0) {
                throw new IllegalArgumentException("Input should be positive");
            }
            Baby[] babyArray = new Baby[n];
            for (int i = 0; i < babyArray.length; i++) {
                sc.nextLine();
                babyArray[i] = new Baby();
                babyArray[i].setName(sc.nextLine());
                babyArray[i].setDay(sc.nextLine());
                babyArray[i].setGender(sc.nextBoolean());
                babyArray[i].setWeight(sc.nextDouble());
                babyArray[i].setLength(sc.nextDouble());
            }
            return babyArray;
        }

    // In ra thong tin cua n baby sau khi chuan hoa ho ten
    void printInforBabies (Baby babies[])
    {
        for (int i = 0; i < babies.length; i++) {
            System.out.println(babies[i].toString());
        }
    }
    // Sap xep cac baby theo trong luong giam dan
    void sortWeight (Baby babies[])
    {

    }
    // Loc ra tat ca nhung baby co gioi tinh la gender
    void filterGender(Baby babies[], String gender)
    {

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Baby[] babies;
        ManageBabies manage_babies = new ManageBabies();
        babies = manage_babies.createData(scan);
        manage_babies.printInforBabies(babies);
    }

}
